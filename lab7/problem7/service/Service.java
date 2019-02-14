package problem7.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import problem7.beans.Employee;
import problem7.exception.EmployeeException;

public class Service implements EmployeeService{
	HashMap<Integer,Employee> list = new HashMap<Integer,Employee>();
	
	@Override
	public String creatEmployee(int id, String name, double salary) throws EmployeeException {
		
		String designation ;
		String insuranceScheme;
		if(salary < 3000) {
			throw new EmployeeException();
		}
		if(salary <5000) {
			designation = "Clerk";
			insuranceScheme = "No Scheme";
		}
		else if(salary <20000) {
			designation = "System Associate";
			insuranceScheme = "C Scheme";
		}
		else if(salary <40000) {
			designation = "Programmer";
			insuranceScheme = "B Scheme";
		}
		else {
			designation = "Manager";
			insuranceScheme = "A Scheme";
		}
		
		Employee emp = new Employee(id, name, salary, designation, insuranceScheme);
		list.put(id,  emp);
		return "Employee added Successfully";
	}

	@Override
	public String display(int id) {
		Employee emp=null;
		
		if(list.containsKey(id)) {
			emp = list.get(id);
			return "Employee Name : " + emp.getName() + '\n' 
					+ "Employee Salary : "+ emp.getSalary() + '\n' 
					+ "Employee Designation : " + emp.getDesignation() + '\n' 
					+ "Employee Insurance Scheme : " + emp.getInsuranceScheme();
		}
		return "Employee id doesn't match to our Database";
	}

	@Override
	public String getInsuranceScheme(int id) {
		Employee emp=null;
		
		if(list.containsKey(id)) {
			return "Employee Insurance Scheme : " + emp.getInsuranceScheme();
		}
		return "Employee id doesn't match to our Database";
	}
 
	
	public List<Employee> displayAllInSortedOrderBySalary() {
		List<Employee> res = new ArrayList<Employee>();
		for(Entry<Integer, Employee> entry: list.entrySet()) {
			res.add(entry.getValue());
		}
		Collections.sort(res, new SortBySalary());
		return res;
	}
	
	public String deleteEmployeeDetails(int id) {
		if(list.containsKey(id)) {
			list.remove(id);
			return "Details Deleted Successfully";
		}
		return "Employee Doesn't Exist";
	}
	
	public String showDetailsByInsuranceScheme(String insuranceScheme) {
		if(insuranceScheme.equals("No Scheme")) {
			return "Salary < 5000 \r \n" + "Designation = Clerk";
		}
		else if(insuranceScheme.equals("Scheme A")) {
			return "Salary >= 40000 \r \n" + "Designation = Manager";
		}
		else if(insuranceScheme.equals("Scheme B")) {
			return "Salary >= 20000 and Salary < 40000 \r \n" + "Designation = Programmer";
		}
		else if(insuranceScheme.equals("Scheme c")) {
			return "Salary > 5000 and Salary < 20000 \r \n" + "Designation = System Associate";
		}
		return "Some thing is Wrong";
	}
}

class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() > o2.getSalary()) {
			return 1;
		}
		else if(o1.getSalary() < o2.getSalary()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
