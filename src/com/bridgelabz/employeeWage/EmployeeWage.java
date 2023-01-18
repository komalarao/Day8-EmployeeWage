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
		int monthlysalary = 0;
		int days = 0;
		int monthlyHours = 0;

		
		while (days != 20 && monthlyHours != 100) {
			days++;
			int randomNum = random.nextInt(3);

			//By using Switch case statement Calculate and getting  salary
			 
			switch (randomNum) {

			case 0:
				System.out.println("Employee is Absent");
				// System.out.println("Monthly Salary will be: ");
				break;
			case 1:
				 System.out.println("Employee is Present for Half Day");				
				salary = wagePerHour * fullDayHours;
				monthlyHours = monthlyHours + fullDayHours;
				break;
			case 2:
				 System.out.println("Employee is Present for Half Day");
				
				salary = wagePerHour * halfDayHours;
				monthlyHours = monthlyHours+halfDayHours;
				break;

			}
			monthlysalary = monthlysalary + salary;
			System.out.println("total hours "+monthlyHours+" and Day" + days + " Salary is: " + salary); // print days and with salary base

		}
		System.out.println("Monthly Salary: " + monthlysalary); // Print the total of monthly salary

	}

}
