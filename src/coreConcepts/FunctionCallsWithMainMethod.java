package coreConcepts;

public class FunctionCallsWithMainMethod {

	//psvm
	public static void main(String[] args) //CR
	{
		System.out.println("Welcome to Java  main");
		addition(44,77,88);
	}
	public static void Main(String[] args) //CR
	{
		System.out.println("Welcome to Java Main");
	}
	
	public static void addition() //Normal
	{
		System.out.println("This is for Addition  0 inputs");
	}
	public static void addition(int num1) //Normal
	{
		System.out.println("This is for Addition 1 inputs");
	}
	public static void addition(int num1,int num2) //Normal
	{
		System.out.println("This is for Addition 2 inputs");
	}
	public static void addition(int num1,int num2,int num3) //Normal
	{
		System.out.println("This is for Addition 3 inputs");
	}
	public static void subtraction() //Normal
	{
		System.out.println("This is for subtraction");
	}
	public static void multiplication() //Normal
	{
		System.out.println("This is for multiplication");
	}
	public static void division() //Normal
	{
		System.out.println("This is for division");
	}
}
