package com.example.demo;

import com.example.demo.controller.GetStudent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@Slf4j/*This Lombok annotation automatically generates a logger for the class, allowing you to log information easily.*/
@SpringBootApplication/*This annotation is used to indicate that this class is the entry point for the Spring Boot application.*/
public class DatabaseApplication implements CommandLineRunner /*This interface allows you to run specific code on application startup.*/
  {

	@Autowired/*This annotation is used to automatically inject the
	            JdbcTemplate dependency into the DatabaseApplication class.*/
	JdbcTemplate jdbc;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	/*The run() method is implemented from the CommandLineRunner interface and runs on application startup.
	  It queries the "students" table to retrieve the admission numbers and logs the result using the logger.*/
	public void run(String... args) throws Exception {
		List<Map<String, Object>> data = jdbc.queryForList("SELECT admission_number FROM students");
		log.info("admission number :: :: {}", data);

		// Assuming GetStudent has appropriate getters and setters for admission_number
		// Set the admission number to be used in the query
		/*GetStudent student1 = new GetStudent();
		student1.setAdmission_number("12345");
		String sql = "SELECT name, admission_number, door_number, street_name, city, zip_code FROM students WHERE admission_number = ?";
		List<Map<String, Object>> students = jdbc.queryForList(sql, student1.getAdmission_number());

		log.info("Student :: :: {}", students);*/
	}
  }
