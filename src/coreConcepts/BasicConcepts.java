package coreConcepts;

//Modifier               class   Name{ members - variables / functions}
//private,default,public
public class BasicConcepts {
	
	//static an non-static

	public static void main(String[] args) 
	{
		//System.out.println("HTTP defines a set of request methods to indicate the desired action to be performed for a given resource. \n Although they can also be nouns, these request methods are sometimes referred to as HTTP verbs.\n Each of them implements a different semantic, but some common features are shared by a group of them: e.g. a request method can be");
		//System.out.print("Welcome to Selenium Automation \t \n");
		//System.out.print("Welcome to \r Selenium Automation");
		//addition();
		addition(55,66);
		//System.out.println(num1);
		BasicConcepts bc = new BasicConcepts();
		bc.addition();
		System.out.println(bc.num1);
		bc.iciciRamLogin();
		bc.iciciLogin("krishna", "today");
		
		bc.openDoor();
		bc.openDoor(2);
		bc.openDoor(4);
		
	}
	
	//Signature - variable
	
	  //Modifier   DataType  name = value;
	                         // Qty : 500 g , 1 kg , 2 kg , 4 kg
	public int stdNum = 22;  //Integer : byte[00-99] , short , int , long
	
	byte num1 = 28; //500 g
	short num2 = 9999; // 2 Kg
	int num3 =9999999;// 4 Kg
	boolean result = true; //binary : 0 1 -> 000110 , 0011110 , 1110011, 
	double percentage = 88;
	char grade = 'A';
	String name = "Ram";
	String grd = "A";
	
	//Signature - function | Method
	
	//Modifier  ReturnType  Name(arguments....opt){  body }
	
	public void addition()
	{
		//body
		int sum = 44+88;
		System.out.println("Sum of two numbers : " + sum);
	}
	
	public static void addition(int a,int b)
	{
		//body
		int sum = a+b;
		System.out.println("Sum of two numbers : " + sum);
	}
	
	//we have only one door
	
	public void openDoor()
	{
		//gfgdfgggg- this logic will open the door
		System.out.println("Do the operations to open the Main door");
	}
	
	//we have four doors
	
	public void openDoor(int doorNum)
	{
		//gfgdfgggg- this logic will open the door
		System.out.println("Do the operations to open the door" + doorNum);
		if(doorNum == 1)
		{
			System.out.println("Use the logic 1 to open the first door");
		}
		else if(doorNum == 2)
		{
			System.out.println("Use the logic 2 to open the second door");
		}
		else if(doorNum == 3)
		{
			System.out.println("Use the logic 3 to open the third door");
		}
		else if(doorNum == 4)
		{
			System.out.println("Use the logic 4 to open the fourth door");
		}
	}
	
    public void iciciRamLogin()
    {
    	//enter username  - ram
    	//enter password  - today
    	System.out.println("if username and pssword is correct allow Ram to login");
    }
    public void iciciLogin(String username,String password)
    {
    	//enter username  - username
    	//enter password  - password
    	System.out.println("if username and pssword is correct allow user to login" + username  + password);
    }
	
	
	

}
