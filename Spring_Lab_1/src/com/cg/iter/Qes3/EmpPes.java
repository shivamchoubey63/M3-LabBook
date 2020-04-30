package com.cg.iter.Qes3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpPes {

	public static void main(String[] args) {
	
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("pes.xml");
		SBU sbu=(SBU) ctx2.getBean("sbu");
		
		System.out.println("SBU Details");
		System.out.println("----------------------------");
		System.out.println(sbu);
		List<Employee> emp=sbu.getEmplist();
		for(Employee data:emp){
			System.out.print("Employee [");
			System.out.print("empId="+data.getEmployeeId()+", ");
			System.out.print("empName="+data.getEmployeeName()+", ");
			System.out.print("empSalary="+data.getSalary()+"]");
			if(emp.indexOf(data)!=emp.size()-1){
				System.out.print(",");
			}
		}
		System.out.print("]");
		
		}
	
	}


