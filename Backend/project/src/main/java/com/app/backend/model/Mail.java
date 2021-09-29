package com.app.backend.model;

import org.springframework.stereotype.Component;

@Component
public class Mail {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}