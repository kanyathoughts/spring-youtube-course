package io.firstPackage.topics;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//This Entity annotation make this class as entity class and create a table for this class
//All id, name, desc will be created as columns
//Any new object for this class will be created as new row.
@Entity
public class Topic {
	
	//In Relational database, we need to set the primary key for any table so here we are mentioning that as id column
	@Id
	private String id;
	private String name;
	private String desc;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
