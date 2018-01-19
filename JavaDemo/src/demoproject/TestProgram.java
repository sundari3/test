package demoproject;

public class TestProgram {
	
	static int d;
	
	int f;

	public static void  main(String[] args) {
		
		System.out.println("Hello world");
		
		TestProgram ab = new TestProgram();
		
		System.out.println(ab.addition(10,20));
		
		System.out.println(addition(10.0f,15.0f));		
		
		System.out.println(d);
		
	}
	
	static
	{
		d=29;
		System.out.println("Hi im static block");
	}
	
	public int addition( int a,int b)
	{
		//int a=10,b=15;
		
		System.out.println("Hi normal");	
		
		System.out.println(d);
		
		return a+b;	
		
		
		}
	
	public static double addition(double a,double b)
	{
		//int a=10,b=15;
		
		System.out.println("Hi stat");
		
		
		
		System.out.println(new TestProgram().f);
		
		return a+b;	
		
		}
}
