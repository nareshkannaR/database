package com.example.demo.handler;

import com.example.demo.controller.AddStudent;
import com.example.demo.repository.StudentRole;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component/*This Spring annotation indicates that this class is a Spring component and
            will be automatically detected and registered in the application context as a bean.*/
public class addStudentHandler {
    @Autowired/*This annotation is used to automatically inject the
                StudentRole repository dependency into the addStudentHandler class.*/
    StudentRole repository;

    public void execute(AddStudent student) {
        repository.insertRecord(student);
    }
}
/*The addStudentHandler class contains the execute() method,
  which takes an AddStudent object and inserts it into the database using the StudentRole repository.*/