package com.example.autowire.name;
//We want to make this car class dependent on the specification class

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification){
        this.specification=specification;
    }
    public void displayDetails(){
        System.out.println("Car Details:"+ specification.toString());
    }

}
