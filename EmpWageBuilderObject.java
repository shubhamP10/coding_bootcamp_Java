/* 
	For Employee Wage UC7 
	@author = Shubham Pattar
*/
import java.util.*;	
public class EmpWageBuilderObject
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private final String company;
	private final int empRatePerHr, numOfWorkingDays, maxHrsPerMonth;
	public EmpWageBuilderObject(String company,int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth)
	{
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	public static void main(String[] args) 
	{
		EmpWageBuilderObject dMart = new EmpWageBuilderObject("DMart",20,2,10);	
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while(totalEmpHrs <= dMart.maxHrsPerMonth && totalWorkingDays < dMart.numOfWorkingDays)
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
		int totalEmpWage = totalEmpHrs * dMart.empRatePerHr;
		System.out.println("Total Emp Wage for the company "+dMart.company+": "+totalEmpWage);
	}
}
