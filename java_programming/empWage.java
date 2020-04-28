import java.util.*;
// import java.Math.*;
public class empWage 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Calculation using Java");
		double check;
		double fullDay = 8;
		double halfDay = 4;
		double wagePerHr = 20;
		double workDays = 20;
		double wage = 0;
		check = Math.floor((Math.random() * 100) % 2 );
		if ((int)check == 1) 
		{
			System.out.println("Employee is Present");
			for (int i = 0; i< workDays ; i++) 
			{
				wage += (wagePerHr * fullDay);
			}
			System.out.println("Monthly Wage = "+wage);
		}
		else
		{
			System.out.println("Employee is Absent!!!");
		}
	}
}
