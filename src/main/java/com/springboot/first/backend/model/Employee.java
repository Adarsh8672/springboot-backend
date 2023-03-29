package com.springboot.first.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Employee_table")
public class Employee {
	
	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String email;

}
