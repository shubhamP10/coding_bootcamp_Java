import EmpWageBuilder.*;
public class EmpWageBuilderArray {

//	private static final int ABSENT = 0;
//	private static final int IS_PART_TIME = 1;
//	private static final int IS_FULL_TIME = 2;
//	
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

//Constructor
	public EmpWageBuilderArray(){
		companyEmpWageArray = new CompanyEmpWage[5];
	}
 
	private void addCompanyEmpWage(String company ,int empRatePerHour,int numOfWorkingDays,int maxHourInMonth )
	{
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHourInMonth);
		numOfCompany++;
		System.out.println(numOfWorkingDays);
	}
	
	private void computeEmpWage(){
		
		for(int i=0; i < 5; i++){
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
    
	private int computeEmpWage(CompanyEmpWage computeEmpWage ){
		// Variable
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		//Computation
		  while(totalEmpHrs <= computeEmpWage.maxHourInMonth && totalWorkingDays <=computeEmpWage.numOfWorkingDays )	{	
		    totalWorkingDays++;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int empCheck1=(int)empCheck;
		
		switch(empCheck1){
			case 0:empHrs=8;  
			System.out.println("Present");
			break;
			case 1:empHrs=4;
			System.out.println("PartTime");
			break;
			case 2:empHrs=0; 
			System.out.println("Absent");
			break;	
	   default:System.out.println("Not Avalaible");			
		}
			  totalEmpHrs+=empHrs;
			  System.out.println("Day:"+totalWorkingDays + " Employee Working Hours:" +empHrs);
		  }
	return totalEmpHrs * computeEmpWage.empRatePerHour;
	}
// Main method 
	public static void main (String args [])
	{
		EmpWageBuilderArray emp = new EmpWageBuilderArray();
    	emp.addCompanyEmpWage("Dmart",20,2,100);
	   	emp.addCompanyEmpWage("Reliance",10,4,100);
	  	emp.computeEmpWage();
	}	
}
