package com.xworkz.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class FamilyDTO {
	private String famname;
	private String father;
	private String mother;
	private String loc;
	private double income;
	private String head;
	private String job;
	private String grandpa;

}
