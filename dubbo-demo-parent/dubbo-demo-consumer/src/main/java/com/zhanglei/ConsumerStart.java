package com.zhanglei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhanglei.pojo.Student;
import com.zhanglei.service.StudentService;

/** 
* @ClassName: ConsumerStart 
* @Description: TODO
* @author: lei zhang
* @date: 2020年2月23日 下午5:33:17 
*/
public class ConsumerStart {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		StudentService studentService = context.getBean(StudentService.class);
		Student student = studentService.getById(20);
		System.out.println(student);
		Student student2 = studentService.addAge(student, 3);
		System.out.println(student2);
		
	}
}
