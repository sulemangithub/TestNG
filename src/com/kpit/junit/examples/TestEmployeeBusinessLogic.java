package com.kpit.junit.examples;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestEmployeeBusinessLogic {

	Employee employee = new Employee(4543, "Sachin Gupta",4500, 23);
	EmployeeBusinessLogic businessLogic = new EmployeeBusinessLogic();
	
	
	@Test
	public void testCalculateAppraisal()
	{
		Assert.assertEquals( businessLogic.calculateAppraisal(employee),500.0);
	}
	
	@Test
	public void testYearlySalary()
	{
		Assert.assertEquals(businessLogic.calculateYearlySalary(employee),54000.0);
	}
	
	@Test(expectedExceptions=RuntimeException.class)
	public void testException()
	{
		businessLogic.callMethod();
		System.out.println("In exception test mathod");
	}
	
	
	@Test(enabled=false)
	public void testSomething()
	{
		fail("Test failed");
		
		System.out.println("Inside testSOmething");
	}
	
	@Test(dependsOnMethods={"testDependant"})
	public void testDependency()
	{
		assertEquals("Dependency successful","Dependency successful");
	}
	
	@Test
	public void testDependant()
	{
		assertEquals("Dependant successful","Dependant failed");
	}
	
	//This test method accepts the parameters from xml file.
	@Test
	@Parameters("username")
	public void testParameter(String username)
	{
		assertEquals(username, "Sachin");
	}
	
	CheckPrimeNumber checkPrimeNumber = null;
	
	@BeforeMethod
	public void initialize()
	{
		checkPrimeNumber = new CheckPrimeNumber();
	}
	
	
	@DataProvider(name="test1")
	public Object[][] primeNumbers()
	{
		return new Object[][]{{9,false},{5,true},{11,true},{12,false},{2,true}};
	}
	
	@Test(dataProvider="test1")
	public void testPrimeNumber(Integer inputNumber,boolean expected)
	{
		assertEquals(expected,checkPrimeNumber.isPrime(inputNumber));
	}
	
	
	
}
