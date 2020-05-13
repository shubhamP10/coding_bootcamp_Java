/* 
	For Employee Wage UC7 
	@author = Shubham Pattar
*/
import java.util.*;	
public class EmpWageBuilderMethod
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRatePerHr, numOfWorkingDays, maxHrsPerMonth;
	public EmpWageBuilderMethod(String company,int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth)
	{
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	private int computeEmpWage()
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while(totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays)
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
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		System.out.println("Total Emp Wage for company "+company+": "+totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String s[])
	{
		EmpWageBuilderMethod dMart = new EmpWageBuilderMethod("DMart",20,2,10);
		EmpWageBuilderMethod bigBasket = new EmpWageBuilderMethod("BigBasket",10,4,35);
		System.out.println("Total Wage for company "+dMart.company+": "+dMart.computeEmpWage());
		System.out.println("Total Wage for company "+bigBasket.company+": "+bigBasket.computeEmpWage());
	}
}
