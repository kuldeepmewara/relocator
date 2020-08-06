package com.kuldeep.Relocator.Services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theme")
public class ServiceTheme {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String themeName;
	
	private int count;
	
	

	public ServiceTheme(String themeName) {
		super();
		
		this.themeName = themeName;
		this.count = 0;
	}

	public ServiceTheme() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getThemeName() {
		return themeName;
	}

	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ServiceTheme [id=" + id + ", themeName=" + themeName + ", count=" + count + "]";
	}
	
	

}
