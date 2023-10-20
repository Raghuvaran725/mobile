package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Mobile {

	@Id

	private int mobileId;

	private String brand;

	private String color;

	private String os;

	

	public Mobile() {}



	public Mobile(int mobileId, String brand, String color, String os) {
		super();
		this.mobileId = mobileId;
		this.brand = brand;
		this.color = color;
		this.os = os;
	}



	public int getMobileId() {
		return mobileId;
	}



	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getOs() {
		return os;
	}



	public void setOs(String os) {
		this.os = os;
	}



	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", brand=" + brand + ", color=" + color + ", os=" + os + "]";
	}


}