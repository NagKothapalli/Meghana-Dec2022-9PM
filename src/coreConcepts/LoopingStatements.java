package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//for(i=1;i<100;i=i+1){ Task }
	@Test
	public void templeRounds()
	{
		for(int i=1;i<100;i=i+1) // i=1 2 3 4.....98  98<100 99<100 100<100
		{ //true
			System.out.println("Round "+i);
		}
	}
	
	// 10/2 = 5 ->Q 0 -> R      10 % 2  -> 0     15/2 = Q->7  R->1
	@Test
	public void applyColor()
	{
		//for(int i=1;i<100;i++)  // 99<100[true]  100<100[false]
		for(int i=1;i<=100;i++) //99<=100[true]  100<=100[true]
		{
			if((i % 10) == 0)  // 10/10, 20/10 , 30/10 , 40/10
			{
				System.out.println("Apply color RED to step :" + i);
				//skip
				continue;
			}
			System.out.println("Apply color green to step :" + i);
		}
	}
	
	//for(where to start ; how long ; step size){  Task  } 
	@Test
	public void applyColorToSteps_Day1() //Definite loop
	{
		for(int i=1;i<=50;i=i+1) //i=1 1<50->true 2<50 .....48<50 , 49<50 50<50->false,  50<=50->true 51<=50->false
		{//True -> Task
			System.out.println("Apply color to step :" + i);
		}
		//False -> it will come out of the loop
	}
	int i=1;
	int j=2;
	int ij = 3;
	int ijk = 4;
	int num = 5;
	int stdNum = 6;
	@Test
	public void findStudent() //25
	{
		for(int rollNum=1;rollNum<=100;rollNum++)
		{
			System.out.println("I am searching :" + rollNum);
			if(rollNum == 25) //1==25 2==25 3==25 .....24==25 25==25
			{
				System.out.println("Found the Student");
				break;
			}
			
		}
		System.out.println("I came out of for loop");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
