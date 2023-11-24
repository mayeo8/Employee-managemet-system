package com.tribeglobal;

public class Employee {
    private int id;
    private String name;
    private String jobTitle;
    private double salary;
    private int age;

    public Employee(){}
    public Employee(String name, String jobTitle, double salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
