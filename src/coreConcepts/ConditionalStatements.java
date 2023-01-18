package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	//if(expression -> true | false){ Task }

	//Task-FT
	
	int bal = 2000;
	int bill = 2500;
	@Test
	public void payBill()
	{
		if(bal > bill) 
		{ //true
			System.out.println("Pay bill :"+bill);
		}
		else
		{ //false
			System.out.println("Insufficient funds");
		}
	}
	@Test
	public void phonepayUser()
	{
		payBill(4000,500);
		payBill(3500,600);
	}
	
	public void payBill(int bal,int bill)
	{
		//fetch current bal
		//bal = current bal;
		if(bal > bill) 
		{ //true
			System.out.println("Pay bill :"+bill);
			//update current balance
		}
		else
		{ //false
			System.out.println("Insufficient funds");
		}
	}
	
	//Write a Program to read two numbers as inputs and display them
	@Test
	public void program_test() //Tester - Unit Testing
	{
		program(4,8);
		program(44,88);
		program(464,898);
		program(4334,5488);
	}
	
	public void program(int num1,int num2) //Dev
	{
		System.out.println("First Number :" + num1);
		System.out.println("Second Number :" + num2);
	}
	
	//Write a Program to read two numbers as inputs and display them ,
	 //perform add if equal , sub if a>b , multiplication a<b
	@Test
	public void multipleDecisions_test() //unit test
	{
		multipleDecisions(45,78); //lines covered / total lines  : 5/15 = 33.3333
		multipleDecisions(465,78);
		multipleDecisions(45,45);
	}
	
	public void multipleDecisions(int num1,int num2) //Dev
	{
		System.out.println("First Number :" + num1);
		System.out.println("Second Number :" + num2);
		if(num1==num2)
		{ //true
			int sum = num1+num2;
			System.out.println("Sum of numbers :" + sum);
		}
		else if(num1>num2)
		{
			int diff = num1-num2;
			System.out.println("Difference of numbers :" + diff);
		}
		else if(num1<num2)
		{
			int prod = num1*num2;
			System.out.println("Product of numbers :" + prod);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
