package com.springcache.demo.model;

public class Instrument {
	String id;
	String insno;
	String group;
	String location;
	String Status;
	public Instrument(String id, String insno, String group, String location, String status) {
		super();
		this.id = id;
		this.insno = insno;
		this.group = group;
		this.location = location;
		Status = status;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInsno() {
		return insno;
	}
	public void setInsno(String insno) {
		this.insno = insno;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
