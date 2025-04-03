package com.anu.immutableex;

public class Address {

	private String city;
	private String name;

	public Address(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}

	public Address() {
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", name=" + name + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
