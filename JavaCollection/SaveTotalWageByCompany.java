import java.util.*;
import java.util.ArrayList;
public class SaveTotalWageByCompany {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	//Variables
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public SaveTotalWageByCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {
	//Variables
	int empHrs = 0;
	int totalEmpHrs = 0;
	int totalWorkingDays = 0;
		//Computation
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
				case IS_PART_TIME:
						empHrs = 4;
				break;
				case IS_FULL_TIME:
						empHrs = 8;
				break;
				default:
						empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		}
		 totalEmpWage = totalEmpHrs * empRatePerHour;
		 saveData();
}
	public void saveData()
	{
		//creating array list to save data
		ArrayList<String> list=new ArrayList<String>();
		list.add(toString());
		list.add(toString());
		
		// Iterator itr=list.iterator();
		// 		while(itr.hasNext()){
		// 			System.out.println(itr.next());
		// 		}
		System.out.println("---DATA SAVED FOR COMPANY -> "+company+" ---");
	}

	//@Override
	public String toString() {
		return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
	}
	/**
  	*main method
  	*@param args args
	*/
	public static void main(String[] args) {
		SaveTotalWageByCompany dMart = new SaveTotalWageByCompany("DMart", 20, 2, 10);
		SaveTotalWageByCompany reliance = new SaveTotalWageByCompany("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	
	}
}