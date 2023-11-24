package com.tribeglobal;

public interface EmployeeInterface {

    //create employee
    public void createEmployee(Employee employee);
    //show all employee
    public void showAllEmployee();
    //show employee using id
    public void showAllEmployeeUsingID(int id);
    //update employee full details
    public void updateEmployee(int id, String name, String jobTitle, double salary, int age);
    //update employee name only, using employee ID
    public void updateEmployeeName(int id, String name);
    //update employee job title
    public void updateEmployeeJobTitle(int id, String jobTitle);
    //update employee salary
    public void updateEmployeeSalary(int id, double salary);
    //update employee age
    public void updateEmployeeAge(int id, int age);
    //delete employee
    public void deleteEmployee(int id);
}
