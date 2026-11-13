package com.ayush;

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
    }
}
