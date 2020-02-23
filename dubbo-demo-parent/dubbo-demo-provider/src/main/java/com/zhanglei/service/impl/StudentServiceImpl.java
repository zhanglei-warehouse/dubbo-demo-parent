package com.zhanglei.service.impl;

import com.zhanglei.pojo.Student;
import com.zhanglei.service.StudentService;

/** 
* @ClassName: StudentServiceImpl 
* @Description: TODO
* @author: lei zhang
* @date: 2020年2月23日 下午5:27:39 
*/
public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		Student s = new Student();
		s.setAge(20);
		s.setId(id);
		s.setName("zhang"+id);
		return s;
	}

	@Override
	public Student addAge(Student stu, int n) {
		stu.setAge(stu.getAge()+n);
		return stu;
	}

}
