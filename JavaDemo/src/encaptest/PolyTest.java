package encaptest;

public class PolyTest {
	
	private int a;
	
	protected void addPri(int a, int b)
	{
		System.out.println(a+b);
		System.out.println("I am from base class ");
	}
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println("I am from base class ");
	}
	
	public void addGoods(int a, int b)
	{
		System.out.println(a+b);
		System.out.println("I am from base class ");
	}

}
