package com.kuldeep.Relocator.Services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NeededTheme")
public class NeededTheme {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String theme;
	
	
	public NeededTheme(String theme) {
		super();
		this.theme = theme;
	}
	
	public NeededTheme() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	

	@Override
	public String toString() {
		return "Theme [id=" + id + ", theme=" + theme + "]";
	}
	
	

}
