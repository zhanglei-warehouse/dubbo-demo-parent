package com.zhanglei.pojo;

import java.io.Serializable;

/** 
* @ClassName: Student 
* @Description: TODO
* @author: lei zhang
* @date: 2020年2月23日 下午5:07:12 
*/
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7175072381975187900L;

	private int id;
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
