package com.seyong.beans;

import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private String gender;
	private int age;
	private Book book;
	private List<Object> list;
	private Map<String, Object> map;
	
	public void destroy(){
		System.out.println("destroy....");
	}
	
	public void init(){
		System.out.println("init.....");
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", book=" + book + ", list=" + list
				+ ", map=" + map + "]";
	}

	public Person(String name, String gender, int age, Book book) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.book = book;
	}

}
