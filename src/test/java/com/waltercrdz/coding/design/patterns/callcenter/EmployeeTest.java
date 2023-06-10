package com.waltercrdz.coding.design.patterns.callcenter;

import com.waltercrdz.coding.challenges.callcenter.Call;
import com.waltercrdz.coding.challenges.callcenter.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmployeeTest {

    @Test
    public void should_createAnEmployeeFree() {
        Assert.assertTrue(Employee.newInstance("1").isFree());
    }

    @Test
    public void should_attendACall() {
        Employee.newInstance("1").attend(new Call(1));
    }

    @Test
    public void should_beFreeAfterAttendACall() {
        final Employee employee = Employee.newInstance("1");
        employee.attend(new Call(1));
        Assert.assertTrue(employee.isFree());
    }

    @Test
    public void should_beBusy_whenAttendACall() {
        final ExecutorService executor = Executors.newFixedThreadPool(1);
        final Employee employee = Employee.newInstance("1");
        executor.execute(() -> employee.attend(new Call(5)));
        Assert.assertTrue(!employee.isFree());
    }
}