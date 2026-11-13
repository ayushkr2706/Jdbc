package com.ayush.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class StudentRepository {

    String url = "jdbc:mysql://localhost:3306/student_db";
    String username = "root";
    String password = "Navneet105#";

    public void createUser() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            //System.out.println("Connection established");

            Statement st = con.createStatement();

            String sql = "INSERT INTO students(name, email, age) " +
                    "VALUES ('Piyush', 'piyush@gmail.com' , 26)";

            int result = st.executeUpdate(sql);

            if (result == 1) {
                System.out.println("Create operation successful");
            } else {
                System.out.println("Create operation failed");
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int id) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            //System.out.println("Connection established");

            Statement st = con.createStatement();

            String sql = "UPDATE students SET age = 22" +
                    " WHERE id = " + id;

            int result = st.executeUpdate(sql);

            if (result == 1) {
                System.out.println("Update operation successful");
            } else {
                System.out.println("Update operation failed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            //System.out.println("Connection established");

            Statement st = con.createStatement();

            String sql = "DELETE FROM students WHERE id = " + id;

            int result = st.executeUpdate(sql);

            if (result == 1) {
                System.out.println("Delete operation successful");
            } else {
                System.out.println("Delete operation failed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllUsers(){

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();

            String sql = "SELECT id, name, email, age FROM students";
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                Long id = (long) rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                int age = rs.getInt(4);
                System.out.println(id + " " + name + " " + email + " " + age);
            }

            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
