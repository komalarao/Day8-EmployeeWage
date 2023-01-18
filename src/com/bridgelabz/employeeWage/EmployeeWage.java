package com.bridgelabz.employeeWage;
import java.util.Random;
public class EmployeeWage {
	
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;

		
		int randomNum = random.nextInt(3);

		
		 // By using Switch case statement Calculate and getting  salary 
		 
		switch (randomNum) {

		case 0:
			System.out.println("Employee is Absent");
			System.out.println("Monthly Salary will be: ");
			break;
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Monthly salary for Full Day: ");
			salary = wagePerHour * fullDayHours;
			break;
		case 2:
			System.out.println("Employee is Present");
			System.out.println("Monthly Salary for Half Day: ");
			salary = wagePerHour * halfDayHours;
			break;

		}
		System.out.println(+salary);

	}

}
