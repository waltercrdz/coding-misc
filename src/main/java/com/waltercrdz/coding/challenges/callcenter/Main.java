package com.waltercrdz.coding.challenges.callcenter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final Dispatcher dispatcher = createDispatcher();
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        dispatcher.dispatchCall(Call.newInstance());
        System.out.println("End of calls");
    }

    private static Dispatcher createDispatcher() {
        return new Dispatcher.Builder()
                .operators(getOperators()).supervisors(getSupervisors()).managers(getManagers()).build();
    }

    private static List<Employee> getOperators() {
        final List<Employee> operators = new ArrayList<>();
        operators.add(Employee.newInstance("1 - Employee"));
        operators.add(Employee.newInstance("2 - Employee"));
        operators.add(Employee.newInstance("3 - Employee"));
        operators.add(Employee.newInstance("4 - Employee"));
        operators.add(Employee.newInstance("5 - Employee"));
        operators.add(Employee.newInstance("6 - Employee"));
        return operators;
    }

    private static List<Employee> getSupervisors() {
        final List<Employee> supervisors = new ArrayList<>();
        supervisors.add(Employee.newInstance("7 - Supervisor"));
        supervisors.add(Employee.newInstance("8 - Supervisor"));
        return supervisors;
    }

    private static List<Employee> getManagers() {
        final List<Employee> managers = new ArrayList<>();
        managers.add(Employee.newInstance("9 - Manager"));
        return managers;
    }
}
