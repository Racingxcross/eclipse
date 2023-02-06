package com.xworkz;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class DetailsDTO {
	
	private String email;
	private long mobile;
	private long adhar;
	private int age;
	private LocalDateTime dob;
	private double salry;

}
