package com.controller;

public class Persons {
private String name;
private int age;
public Persons()
{
	super();
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
@Override
public String toString() {
	return "Persons [name=" + name + ", age=" + age + "]";
}
}
