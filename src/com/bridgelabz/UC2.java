package com.bridgelabz;

import java.util.Random;

public class UC2 {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int attendance = random.nextInt(2);
		int wagePerHour = 20;
		int fullDayHour = 8;
		int wagePerDay = 0;
		int partdayhour=4;
		if (attendance ==1 )
		{
			System.out.println("Employee is	 present");
			wagePerDay = wagePerHour*fullDayHour;
			System.out.println(wagePerDay);
			
		}
		else
			System.out.println("Employee is not prescent");
		wagePerDay = wagePerHour*partdayhour;
		System.out.println(wagePerDay);
	}
	
}
