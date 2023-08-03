package com.example.demo.controller;

import com.example.demo.handler.addStudentHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController/*This Spring annotation indicates that this class serves as a
 RESTful web service controller, meaning it handles HTTP requests and returns the response directly.*/


public class StudentController {
    @Autowired/*This annotation is used to automatically inject
                the addStudentHandler dependency into the StudentController class.*/
    addStudentHandler handler;
    @PostMapping("/Student")/* This annotation is used to map the name() method
                               to handle HTTP POST requests at the "/Student" endpoint.*/
    public String name(@RequestBody AddStudent student) {
        handler.execute(student);
        return "ok!";
    }
}
/* This annotation is used to map the name() method to handle HTTP POST requests at the "/Student" endpoint.*/

