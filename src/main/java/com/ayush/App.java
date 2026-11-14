package com.ayush;

import com.ayush.model.Student;
import com.ayush.repository.StudentRepository;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        StudentRepository studentRepository = new StudentRepository();
        //studentRepository.createUser();
        //studentRepository.updateUser(1);
        //studentRepository.deleteUser(1);
        studentRepository.getAllUsers();

//        studentRepository.createPreparedUser(new Student("Navneet",
//                "navneet@gmail.com", 52));
    }
}
