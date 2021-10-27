package test_classes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class classB 
{
	@BeforeClass
	public void bc()
	{
		System.out.println("bc1");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("bm1");
	}
	
	@Test (priority=1)
	public void testA()
	{
		System.out.println("A1");
	}
	
	@Test (priority=0)
	public void testB()
	{
		System.out.println("B1");
	}		
	

	@Test (priority=2)
	public void testC()
	{
		System.out.println("C1");
	}
	
	@Test (priority=3)
	public void testD()
	{
		System.out.println("D1");
	}
}
