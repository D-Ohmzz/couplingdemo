package com.example.autowire.annotation;

import org.springframework.stereotype.Component;


@Component("manager")
public class Manager {
    private final Employee employee;

    //You don't need the autowired annotation
    public Manager(Employee employee){
        this.employee=employee;
    }

    @Override
    public String toString(){
        return "Manager{" + 
        "employee:" + employee +
        '}';

    }

}
