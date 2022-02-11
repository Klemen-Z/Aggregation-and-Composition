package com.main.aggregation;

public class Job {

    private int salary;
    private String name;

    Job(int salary, String name){
        setName(name);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
