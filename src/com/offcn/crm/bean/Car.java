package com.offcn.crm.bean;

public class Car {

	private int cid;
	private String color;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", color=" + color + "]";
	}
	
	
	
}
