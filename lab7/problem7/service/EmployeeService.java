package problem7.service;

import problem7.exception.EmployeeException;

public interface EmployeeService {
	
	String creatEmployee(int id, String name, double salary) throws EmployeeException;
	
	String display(int id);
	
	String getInsuranceScheme(int id);
}