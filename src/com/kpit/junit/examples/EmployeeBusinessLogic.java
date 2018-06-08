package com.kpit.junit.examples;

public class EmployeeBusinessLogic {
	
	public double calculateYearlySalary(Employee employee)
	{
		double salary = employee.getSalary();
		return 12 * salary;		
	}
	
	public double calculateAppraisal(Employee employee)
	{
		if(employee.getSalary() > 10000)
		{
			return 1000;
		}
		else
		{
			return 500;
		}
	}

	public void callMethod() throws RuntimeException{
		// TODO Auto-generated method stub
		
		throw new RuntimeException();
		
	}

	

}
