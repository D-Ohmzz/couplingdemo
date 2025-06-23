package com.example.componentscan.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    private int employeeId;
    @Value("Hello") //Default value
    private String firstName;
    @Value("Value") //Default value
    private String lastName;
    private double salary;

    public void setemployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public int getemployeeId(){
        return employeeId;
    }

    public void setfirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setlastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setsalary(double salary){
        this.salary=salary;
    }
    public double getsalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "MyBean{" + 
        "employeeId:" + employeeId +
        ", firstName: '" + firstName + '\'' +
        ", lastName: '" + lastName + '\'' +
        ", salary:" + salary +
        '}';

    }



}
