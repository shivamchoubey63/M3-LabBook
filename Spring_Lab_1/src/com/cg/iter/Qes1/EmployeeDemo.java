package com.cg.iter.Qes1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo {

	public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("employee1.xml");
	Employee emp =(Employee) ctx.getBean("emp");
	System.out.println(emp);
	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println("EmployeeId : "+emp.getEmployeeId());
	System.out.println("Employee Name : "+emp.getEmployeeName());
	System.out.println("Employee Salary : "+emp.getSalary());
	System.out.println("Employee BU :  "+emp.getBusinessUnit());
	System.out.println("Age: "+emp.getAge());

	}

}
