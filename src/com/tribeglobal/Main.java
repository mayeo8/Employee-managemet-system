package com.tribeglobal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, jobTitle;
        int id, age;
        double salary;
        Scanner sc = new Scanner(System.in);
        EmployeeImplementation methods = new EmployeeImplementation();
        System.out.println("Welcome To Employee Management");
        do {
            System.out.println("""
                    1. Add Employee
                    2. Show All Employees
                    3. Show Employees Based On ID
                    4. Update Employee Details
                    5. Delete Employee Details
                    6. Exit
                    """);
            System.out.println("Enter Selection: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    Employee employee = new Employee();
                    System.out.println("Enter ID: ");
                    id = sc.nextInt();
                    System.out.println("Enter Job Title: ");
                    jobTitle = sc.next();
                    System.out.println("Enter Salary: ");
                    salary = sc.nextDouble();
                    System.out.println("Enter Age: ");
                    age = sc.nextInt();
                    System.out.println("Enter Name: ");
                    name = sc.next();
                    employee.setId(id);
                    employee.setName(name);
                    employee.setJobTitle(jobTitle);
                    employee.setSalary(salary);
                    employee.setAge(age);
                    methods.createEmployee(employee);
                }
                case 2 ->{
                    System.out.println("These Are All The Employees !!");
                    methods.showAllEmployee();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Enter ID: ");
                    int employeeId = sc.nextInt();
                    methods.showAllEmployeeUsingID(employeeId);
                }
                case 4 -> {
                    System.out.println("Select Employee Details You Want To Update");
                    System.out.println("""
                            1. All Employee Details
                            2. Employee name
                            3. Employee Job Title
                            4. Employee Salary
                            5. Employee Age
                            """);
                    int input = sc.nextInt();
                    switch (input){
                        case 1 -> {
                            System.out.println("Enter ID To Update Details");
                            id = sc.nextInt();
                            System.out.println("Enter Name:");
                            name = sc.next();
                            System.out.println("Enter Job Title");
                            jobTitle = sc.next();
                            System.out.println("Enter Salary");
                            salary = sc.nextDouble();
                            System.out.println("Enter Age");
                            age = sc.nextInt();
                            methods.updateEmployee(id,name,jobTitle,salary,age);
                        }
                        case 2 -> {
                            System.out.println("Enter ID To Update Details");
                            id = sc.nextInt();
                            System.out.println("Enter Name:");
                            name = sc.next();
                            methods.updateEmployeeName(id, name);
                        }
                        case 3 -> {
                            System.out.println("Enter ID To Update Details");
                            id = sc.nextInt();
                            System.out.println("Enter Job Title");
                            jobTitle = sc.next();
                            methods.updateEmployeeJobTitle(id, jobTitle);
                        }
                        case 4 -> {
                            System.out.println("Enter ID To Update Details");
                            id = sc.nextInt();
                            System.out.println("Enter Salary");
                            salary = sc.nextDouble();
                            methods.updateEmployeeSalary(id, salary);
                        }
                        case 5 -> {
                            System.out.println("Enter ID To Update Details");
                            id = sc.nextInt();
                            System.out.println("Enter Age");
                            age = sc.nextInt();
                            methods.updateEmployeeAge(id, age);
                        }
                        default -> System.out.println("Enter A Valid Input");
                    }
                }
                case 5 -> {
                    System.out.println("Enter ID To Delete Employee");
                    id = sc.nextInt();
                    methods.deleteEmployee(id);
                }
                case 6 -> {
                    System.out.println("Thank You For Your Time");
                    System.exit(0);
                }
                default -> System.out.println("Enter A valid Choice");
            }
        }while (true);
    }
}
