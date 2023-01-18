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

		
		int randomNum = random.nextInt(2);

		//check attendance
		if (randomNum == 1) {
			System.out.println("Employee  is Present");
			salary = wagePerHour * fullDayHours;
			System.out.println("daily wage  for Full Day is: " + salary);
		} else if (randomNum == 2) {
			salary = halfDayHours * wagePerHour;
			System.out.println("daily wage for Half Day is: " + salary);
		} else
			System.out.println("Employee  is Absent");
		System.out.println("salary is: " + salary);

	}

}
