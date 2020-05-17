package EmpWageBuilder;

public interface IComputeEmpWage 
{
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHourInMonth);
	public void computeEmpWage();
	public int getTotalWage();
}

