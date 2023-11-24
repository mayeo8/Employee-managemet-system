package com.tribeglobal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    static Connection connection;
    public static Connection createDBConnection(){
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "couture";
        try {
            connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
