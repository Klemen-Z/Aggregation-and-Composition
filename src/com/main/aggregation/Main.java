package com.main.aggregation;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(20, "Bob Simpleton", true);

        System.out.println("Age: " + p.getAge());
        System.out.println("Name: " + p.getName());

        System.out.println("");
        p.getJob();
    }
}
