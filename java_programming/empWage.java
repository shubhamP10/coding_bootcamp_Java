import java.util.*;
// import java.Math.*;
class empSalary
{
	public void employee()
	{
	double check;
	double fullDay = 8;
	double halfDay = 4;
	double wagePerHr = 20;
	double workDays = 20;
	double wage = 0;
	double totWorkHr = 0;
	check = Math.floor((Math.random() * 100) % 2 );
	if ((int)check == 1) 
	{
		System.out.println("Employee is Present");
		for (int i = 0; i< workDays ; i++) 
		{
			wage += (wagePerHr * fullDay);
			totWorkHr += fullDay;
			if(totWorkHr >= 100)
			{
				break;
			}
		}
		System.out.println("Monthly Wage = "+wage);
	}
	else
	{
		System.out.println("Employee is Absent!!!");
	}
	}
}
public class empWage extends empSalary
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Calculation using Java");
		empSalary emp = new empSalary();
		emp.employee();
	}
}
