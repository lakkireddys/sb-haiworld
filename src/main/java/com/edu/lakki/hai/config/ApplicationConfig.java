package com.edu.lakki.hai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public class ApplicationConfig {
	private String firstname;
	private String surname;
	public String getSurname() {
		return surname;
	}
	public void setSurname(String personSurname) {
		this.surname = personSurname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String personFirstname) {
		this.firstname = personFirstname;
	}
}
