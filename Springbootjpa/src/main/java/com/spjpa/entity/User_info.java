package com.spjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="user_details")
public class User_info {
/*** 
 create table user_details(user_id number(5), email varchar2(50),
name VARCHAR2(50), contact_number number(10), age number(3),
city VARCHAR2(20), gender varchar2(10));

 ***/
	@Id
	@Column(name="user_id")
	private int id;
	@Column(name="email")
	private String mailid;
	@Column(name="name")
	private String name;
	@Column(name="contact_number")
	private  long phonenumber;
	@Column(name="age")
	private int age;
	@Column(name="city")
	private String citnames;
	@Column(name="gender")
	private String gender;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getcitName() {
		return citnames;
	}
	public void setcitName(String citNames) {
		this.citnames = citNames;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() { // default method calling no need object calling
	    return "User_info ======id=" + id +
	           ", name=" + name +
	           ", mailid=" + mailid +
	           ", phonenumber=" + phonenumber +
	           ", age=" + age +
	           ", cityname=" + citnames +
	           ", gender=" + gender + "]";
	}

	
}
