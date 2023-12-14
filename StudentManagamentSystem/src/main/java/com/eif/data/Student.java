package com.eif.data;

public class Student {
	
	String Name;
	int Id;
	String City;
	String Country;
	String Major;

	public Student() {
		
	}
	
	public Student(String name, int id, String city, String country, String major) {
		super();
		Name = name;
		Id = id;
		City = city;
		Country = country;
		Major = major;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	
}
