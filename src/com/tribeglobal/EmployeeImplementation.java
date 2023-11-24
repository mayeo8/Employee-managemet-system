package com.tribeglobal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeImplementation implements EmployeeInterface{
    Connection connect;
    @Override
    public void createEmployee(Employee employee) {
        /**
         * we only used the employee class when we were creating an employee object, at this end we are feeding the DB
         * values of the employee class using getters at the frontend we passed in the values of each field, so we can
         * get it from this end this method takes in an employee object so when we call it at the frontend we passed the
         * created employee with its field filled with user input
         * */
        connect = DBConnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?,?)";
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1,employee.getId());
            statement.setString(2, employee.getName());
            statement.setString(3, employee.getJobTitle());
            statement.setDouble(4, employee.getSalary());
            statement.setInt(5, employee.getAge());

            int rows = statement.executeUpdate();
            if (rows>0){
                System.out.println("Employee Added Successfully");
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void showAllEmployee() {
        /**
         * at this end we are retrieving values from the database and returning them not as an entire java object but as individual
         * values for example strings and integers
         * */
        connect = DBConnection.createDBConnection();
        String query = "select * from employee";
        try {
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                String data = "";
                for (int i = 1; i < 6; i++) {
                    data += result.getString(i) + " | ";
                }
                System.out.println(data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void showAllEmployeeUsingID(int id) {
        /**
         *using an id to return an entire column i think you can use any property to return an entire column like name or age
         * */
        connect = DBConnection.createDBConnection();
        String query = "select * from employee where employee_id=" + id;
        try {
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                String data = "";
                for (int i = 1; i < 6; i++) {
                    data += result.getString(i) + " | ";
                }
                System.out.println(data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name, String jobTitle, double salary, int age) {
        /**
         * at this point we are no longer dealing with java objects just values in the database, passing in normal values
         * to update the previous values i think the employee class it's just a way to group variables that represent or
         * signify something meaningful like parts of the human body yau can declare variables independently  but it does
         * not have a meaning it does not have a heading or title roof over its head
         * */
        connect = DBConnection.createDBConnection();
        String query = "update employee set name=?, job_title=?, salary=?, age=? where employee_id=?";
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, jobTitle);
            statement.setDouble(3, salary);
            statement.setInt(4, age);
            statement.setInt(5, id);
            int rows = statement.executeUpdate();
            if (rows > 0){
                System.out.println("Details Updated Successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        //returning the updated employee details
        String getQuery = "select * from employee where employee_id=" + id;
        try {
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(getQuery);
            while (result.next()){
                String data = "";
                for (int i = 1; i < 6; i++) {
                    data += result.getString(i) + " | ";
                }
                System.out.println(data);
            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployeeName(int id, String name) {
        connect = DBConnection.createDBConnection();
        String query = "update employee set name=? where employee_id=?";
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, id);
            int rows = statement.executeUpdate();
            if (rows > 0){
                System.out.println("Details Updated Successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        String getQuery = "select * from employee where employee_id=" + id;
        try {
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(getQuery);
            while (result.next()){
                String data = "";
                for (int i = 1; i < 6; i++) {
                    data += result.getString(i) + " | ";
                }
                System.out.println(data);
            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployeeJobTitle(int id, String jobTitle) {
        connect = DBConnection.createDBConnection();
        String query = "update employee set job_title=? where employee_id=?";
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, jobTitle);
            statement.setInt(2, id);
            int rows = statement.executeUpdate();
            if (rows > 0){
                System.out.println("Details Updated Successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        String getQuery = "select * from employee where employee_id=" + id;
        try {
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(getQuery);
            while (result.next()){
                String data = "";
                for (int i = 1; i < 6; i++) {
                    data += result.getString(i) + " | ";
                }
                System.out.println(data);
            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployeeSalary(int id, double salary) {
        connect = DBConnection.createDBConnection();
        String query = "update employee set salary=? where employee_id=?";
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setDouble(1, salary);
            statement.setInt(2, id);
            int rows = statement.executeUpdate();
            if (rows > 0){
                System.out.println("Details Updated Successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        String getQuery = "select * from employee where employee_id=" + id;
        try {
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(getQuery);
            while (result.next()){
                String data = "";
                for (int i = 1; i < 6; i++) {
                    data += result.getString(i) + " | ";
                }
                System.out.println(data);
            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateEmployeeAge(int id, int age) {
        connect = DBConnection.createDBConnection();
        String query = "update employee set age=? where employee_id=?";
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, age);
            statement.setInt(2, id);
            int rows = statement.executeUpdate();
            if (rows > 0){
                System.out.println("Details Updated Successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        String getQuery = "select * from employee where employee_id=" + id;
        try {
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(getQuery);
            while (result.next()){
                String data = "";
                for (int i = 1; i < 6; i++) {
                    data += result.getString(i) + " | ";
                }
                System.out.println(data);
            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        connect = DBConnection.createDBConnection();
        String query = "delete from employee where employee_id=?";
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            if (rows > 0){
                System.out.println("Employee Deleted Successfully");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
