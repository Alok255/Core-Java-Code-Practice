package test;

import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private int id;
	
	public Student(String name, int id){
		
		this.name=name;
		this.id=id;
	}
	
	public String toString(){
		return "Student : " + name + " Id:" +id ;
	}
}
