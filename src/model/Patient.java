package model;

import java.util.Date;

public class Patient extends User{
	private Date birthday;
	private double weight;
	private double height;
	private String blood;
	
	public Patient(String name, String email) {
		super(name, email);
	}
	
	@Override
	public void showDataUser() {
		System.out.println("Paciente");
	}
}