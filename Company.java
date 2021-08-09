package EmployeeWage;

public class Company {
	

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation program");

			Employee Flipkart = new Employee(20, 100, 20);
			Employee Amazon = new Employee(22, 110, 22);
			Employee Myntra = new Employee(18, 95, 18);

			System.out.println();
			System.out.println("Total Employee Wage of Flipkart is : " +Flipkart .employeeWage());

			System.out.println("Total Employee Wage of Amazon is : " + Amazon .employeeWage());

			System.out.println("Total Employee Wagee of Myntra is : " + Myntra.employeeWage());

		}

	}

