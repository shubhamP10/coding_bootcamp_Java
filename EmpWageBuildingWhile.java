/* 
	For Employee Wage UC7 
	@author = Shubham Pattar
*/
import java.util.*;	
public class EmpWageBuildingWhile
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HOURS_IN_MONTH = 10;

	public static void main(String s[])
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while(totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor( Math.random() * 10 ) % 3;
			switch(empCheck)
			{
				case IS_PART_TIME : empHrs = 4;
									break;
				case IS_FULL_TIME : empHrs = 8;
									break;
				default : empHrs = 8;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+totalWorkingDays+" Emp Hrs: "+empHrs);
		}
		int totalEmpWage = totalEmpHrs * RATE_PER_HOUR;
		System.out.println("Total Emp Wage: "+totalEmpWage);
	}
}
