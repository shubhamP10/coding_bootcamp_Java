import java.util.*;
// import java.Math.*;
public class empWage 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Calculation using Java");
		double check;
		check = Math.floor((Math.random() * 100) % 2 );
		if ((int)check == 1) 
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent!!!");
		}
	}
}
