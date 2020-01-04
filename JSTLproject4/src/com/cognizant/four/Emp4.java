package com.cognizant.four;

public class Emp4 {
	private String id;
	private String name;
	private Boolean gender;
	private String dateofBirth;
	private Boolean FulltimeEmployee;
	public Emp4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp4(String id, String name, Boolean gender, String dateofBirth, Boolean fulltimeEmployee) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
		FulltimeEmployee = fulltimeEmployee;
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
	public Boolean getFulltimeEmployee() {
		return FulltimeEmployee;
	}
	public void setFulltimeEmployee(Boolean fulltimeEmployee) {
		FulltimeEmployee = fulltimeEmployee;
	}
	
	
}
