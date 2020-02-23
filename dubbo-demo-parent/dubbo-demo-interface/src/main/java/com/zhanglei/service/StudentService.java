package com.zhanglei.service;

import com.zhanglei.pojo.Student;

/** 
* @ClassName: StudentService 
* @Description: TODO
* @author: lei zhang
* @date: 2020年2月23日 下午5:12:32 
*/
public interface StudentService {

	Student getById(int id);
	
	Student addAge(Student stu,int n);
	
	
	
}
