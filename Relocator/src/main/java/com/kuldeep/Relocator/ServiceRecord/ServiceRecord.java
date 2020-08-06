package com.kuldeep.Relocator.ServiceRecord;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ServiceRecord")
public class ServiceRecord {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private String phone;
	private String theme;
	private String state;
	private String city;
	private String comment;
	private long userId;
	
	
	public ServiceRecord(long id, String name, String phone, String theme, String state, String city, String comment,
			long userId) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.theme = theme;
		this.state = state;
		this.city = city;
		this.comment = comment;
		this.userId = userId;
	}
	public ServiceRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ServiceRecord [id=" + id + ", name=" + name + ", phone=" + phone + ", theme=" + theme + ", state="
				+ state + ", city=" + city + ", comment=" + comment + ", userId=" + userId + "]";
	}
	
	

	
	
	
	
	
	

}
