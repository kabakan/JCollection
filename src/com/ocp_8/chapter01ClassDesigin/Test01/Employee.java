package com.ocp_8.chapter01ClassDesigin.Test01;

/**
 * Created by Kanat KB on 22.07.2017.
 * A. Success
 */
public class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;
    @Override
    public int hashCode() {
        return employeeId;
    }
    public boolean equals(Employee e) {
        return this.employeeId == e.employeeId;
    }
    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two)) System.out.println("Success");
        else System.out.println("Failure");
    } }
