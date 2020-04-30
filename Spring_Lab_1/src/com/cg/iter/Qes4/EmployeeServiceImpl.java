package com.cg.iter.Qes4;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getDetails(int empId) {
		EmployeeDAO emp=new EmployeeDAO();
		return emp.getDetails(empId);
	}

}
