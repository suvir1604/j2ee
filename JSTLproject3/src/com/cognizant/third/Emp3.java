package com.cognizant.third;

public class Emp3 {
	private String id;
	private String name;
	private Boolean gender;
	private String dateofBirth;
	public Emp3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp3(String id, String name, Boolean gender, String dateofBirth) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	

}
