package com.example.demo.controller;

import com.example.demo.repository.StudentRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter//This Lombok annotation generates getters for all the fields in the class automatically.
@AllArgsConstructor// This Lombok annotation generates a constructor with parameters for all the fields in the class.
public class AddStudent {
    @Autowired//This Spring annotation is used to automatically inject the StudentRole repository dependency into the AddStudent class.
    StudentRole repository;

    String name;
    String admission_number;
    String streetName;
    String door_no;
    String city;
    int zipcode;

}
/*The AddStudent class represents a model for student data, including fields like name, admission_number,
 streetName, door_no, city, and zipcode.*/