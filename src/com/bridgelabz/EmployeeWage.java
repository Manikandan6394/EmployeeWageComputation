package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
//My code
	
	public void employeeIsPresentOrNot() {
	
	}
	public static void main(String[] args) {
//My code		 
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int attendance = random.nextInt(2);
		if (attendance ==1 )
		{
			System.out.println("Employee is	 present");
		}
		else
		{
		System.out.println("Employee is not present");	

}
	}
}