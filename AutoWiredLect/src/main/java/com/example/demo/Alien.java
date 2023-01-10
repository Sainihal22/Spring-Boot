package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component                // it means that object should be created for this class
//@Scope("prototype")       // object gets created when it hits getbean
public class Alien 
{
	private int aid;
	private String aname;
	private String Tech;
	
	@Autowired                         // it will search for object laptop and gets connected
	@Qualifier("lap1")                 // search by name
	private Laptop laptop;
	
	
	public Alien() {
		System.out.println("Object Created");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return Tech;
	}
	public void setTech(String tech) {
		Tech = tech;
	}
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("In Alien.java void show()");
		laptop.compile();
	}
	
}


