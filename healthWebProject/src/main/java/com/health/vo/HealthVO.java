package com.health.vo;

public class HealthVO {
	
	String id;
	String password;
	int weight;
	int height;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "VO [id=" + id + ", password=" + password + ", weight=" + weight + ", height=" + height + "]";
	}
	
}
