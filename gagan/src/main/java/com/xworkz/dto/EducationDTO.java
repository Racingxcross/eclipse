package com.xworkz.dto;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class EducationDTO {
	private String name;
	private String college;
	private String degree;
	private String loc;
	private LocalDateTime dob;
	private double fee;
	private int age;
	private String fName;

}
