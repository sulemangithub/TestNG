package com.kpit.junit.examples;

public class CheckPrimeNumber {
	
	public boolean isPrime(int number)
	{
		for(int i=2;i<number;i++)
		{
			if(number%2 == 0)
				return true;
		}
		
		return true;
	}

}
