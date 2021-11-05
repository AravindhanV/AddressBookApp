package com.bridgelabz.addressbookapp.dto;

public class EmployeePayrollDTO {
	public String id;
	public String name;
	
	public EmployeePayrollDTO(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "{id:"+id+", name:"+name+"}";
	}
}
