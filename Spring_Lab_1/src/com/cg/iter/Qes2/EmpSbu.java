package com.cg.iter.Qes2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmpSbu {

	public static void main(String[] args) {
		
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("sbu.xml");
		Employee emp1 =(Employee)ctx1.getBean("emp1");
		System.out.println(emp1);
		SBU sbu= (SBU) ctx1.getBean("sbu");
		System.out.println(sbu);
		
	}

}
