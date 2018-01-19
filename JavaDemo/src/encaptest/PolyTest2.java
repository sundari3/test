package encaptest;

public class PolyTest2 extends PolyTest {
	
	
	public static void main(String args[])
	{
		PolyTest2 ab = new PolyTest2();
		
		ab.add(10, 20);
	}
	
	public void add(int a, int b)
	{
		System.out.println(a*b);
		System.out.println("I am from child class ");
	}
	
}
