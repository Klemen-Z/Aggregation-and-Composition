package com.main.aggregation;

public class Person {
    private int age;
    private String name;
    private Job j;
    private boolean hasJob;

    Person(int age, String name, boolean hasJob){
        setAge(age);
        setName(name);
        setHasJob(hasJob);

        if(this.hasJob){
           setJ(new Job(10000, "Pizza delivery"));
        } else {
           setJ(new Job(0, "Unemployed"));
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJ(Job j) {
        this.j = j;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    public String getName() {
        return name;
    }

    public Job getJ() {
        return j;
    }
    public void getJob(){
        if(this.hasJob){
            System.out.println("Job: " + j.getName());
            System.out.println("Salary: " + j.getSalary());
        } else {
            System.out.println(getName() + " is unemployed");
        }
    }

    public int getAge() {
        return age;
    }
}
