package com.techelevator;

public class Employee {

    // Setting states

    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

    // Constructor

    public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
    }

    // Methods (do stuff)
    public void raiseSalary(double percent){
        this.annualSalary =  annualSalary + (annualSalary* (percent / 100d));
    }

    // Getters and setters

    public String getFullName(){
        return lastName + ", " + firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDepartment(){
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
