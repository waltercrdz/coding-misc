package com.waltercrdz.coding.design.patterns.callcenter;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AttentionChain {

    private ExecutorService executor;
    private List<Employee> employees;
    private Optional<AttentionChain> next;

    public AttentionChain(List<Employee> employees, AttentionChain next) {
        this.executor = Executors.newFixedThreadPool(employees.size());
        this.employees = Objects.requireNonNull(Collections.synchronizedList(employees), "Employees is mandatory.");
        this.next = Optional.ofNullable(next);
    }

    public void handle(Call call) {
        final Optional<Employee> employee = this.findFreeEmployee();
        if (employee.isPresent()) {
            this.executor.execute(() -> employee.get().attend(call));
            return;
        }
        this.findNext(call);
    }

    private synchronized Optional<Employee> findFreeEmployee() {
        return this.employees.stream().filter(Employee::isFree).findFirst();
    }

    private void findNext(Call call) {
        this.next.ifPresent(chain -> chain.handle(call));
    }
}
