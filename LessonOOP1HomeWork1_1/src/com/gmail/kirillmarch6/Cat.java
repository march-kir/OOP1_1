package com.gmail.kirillmarch6;

public class Cat {

	private String name;
	private String type;
	private int age;
	private boolean sex;
	
	public Cat(String name, String type, int age, boolean sex) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.sex = sex;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public void getVoice() {
		System.out.println("Meow - Meow!!!");
	}
	
	public void getEat() {
		System.out.println("It's my milk!!!");
	}
	
	public void toPlay() {
		System.out.println("I need to play!!!");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	
	
	
}
