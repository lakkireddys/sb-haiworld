package com.edu.lakki.hai.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

	private String name;
	private String contact;
	private int age;
}
