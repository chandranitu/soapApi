package bean;

import java.io.Serializable;

public class Person implements Serializable{
	
private static final long serialVersionUID = -1277579081118070535L;
	
	private int id;
	private String name;
	private int age;	
	private int sal;
	private String loc;
	
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return id+"::"+name+"::"+age+"::"+sal+"::"+loc;
	}


}
