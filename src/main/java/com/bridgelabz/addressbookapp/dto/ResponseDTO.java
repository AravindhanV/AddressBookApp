package com.bridgelabz.addressbookapp.dto;

public class ResponseDTO {
	private String message;
	private Object data;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData() {
		this.data = data;
	}
}
