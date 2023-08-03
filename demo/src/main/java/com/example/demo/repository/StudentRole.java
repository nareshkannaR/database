package com.example.demo.repository;

import com.example.demo.controller.AddStudent;
import com.example.demo.controller.GetStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository/*This Spring annotation is used to indicate that this class is a data repository,
             which typically interacts with the database.*/
public class StudentRole {
    @Autowired/*This annotation is used to automatically inject the JdbcTemplate dependency into the StudentRole class.*/
    JdbcTemplate jdbcTemplate;

    public void insertRecord(AddStudent student)/*The StudentRole class contains the insertRecord() method,
                                                  which takes an AddStudent object and
                                                  inserts its data into the "students" table in the database using the JdbcTemplate.*/
    {
        System.out.println(student);
        jdbcTemplate.update("INSERT INTO students (name, admission_number, door_number, street_name, city, zip_code) VALUES (?, ?, ?, ?, ?, ?)",
                student.getName(), student.getAdmission_number(), student.getDoor_no(), student.getStreetName(), student.getCity(), student.getZipcode());
    }

/*    public void retrieveRecord(GetStudent student1) {
        System.out.println(student1);
        jdbcTemplate.queryForList("SELECT name, admission_number, door_number, street_name, city, zip_code FROM students WHERE admission_number = ?");
        }*/



}
