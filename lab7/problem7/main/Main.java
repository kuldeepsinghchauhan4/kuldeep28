package problem7.main;


import java.util.Scanner;

import problem7.exception.EmployeeException;
import problem7.service.Service;

public class Main {
	
	static Service s = new Service();
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter your choice \n"
					+ "1. creat User \n"
					+ "2. show your details \n"
					+ "3. show your Insurance Scheme \n"
					+ "4. Exit"
					+ "5. To show Employee Details by Insurance Scheme"
					+ "6. Delete Employee Details"
					+ "7. Display All Employee in Sorted Order on the Basis of Salary");
			int choice = sc.nextInt();
			
			switch(choice) {
				
				case 1: createUser();	break;
				
				case 2: showUserDetails(); 	break;
				
				case 3: showInsuranceScheme();	break;
				
				case 4: System.exit(0);	break;
				
				case 5:	showDetailsByInsuranceScheme();	break;
				
				case 6: deleteEmployeeDetails();	break;
				
				case 7: displayAllInSortedOrderBySalary();	break;
				
				default : System.out.println("Wrong choice");
			}
		}

	}

	private static void displayAllInSortedOrderBySalary() {
		System.out.println(s.displayAllInSortedOrderBySalary());
	}

	private static void deleteEmployeeDetails() {
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(s.deleteEmployeeDetails(id));
		
	}

	private static void showDetailsByInsuranceScheme() {
		String insuranceScheme = sc.nextLine();
		System.out.println(s.showDetailsByInsuranceScheme(insuranceScheme));
	}

	private static void createUser() {
		
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user Name");
		String name = sc.nextLine();
		System.out.println("Enter User Salary");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		try {
			System.out.println(s.creatEmployee(id, name, salary));
		} catch (EmployeeException e) {
			System.out.println("Minimum Balance Should be more than 3000");
		}
		
	}

	private static void showUserDetails() {
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(s.display(id));
	}

	private static void showInsuranceScheme() {
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(s.getInsuranceScheme(id));
	}

}
