package com.company;

public class tuna {
    private String carName;
    public void setName(String name){
        carName = name;
    }
    public String getName(){
        return carName;
    }
    public void saying(){
        System.out.printf("your car name was %s", getName());
    }
}
