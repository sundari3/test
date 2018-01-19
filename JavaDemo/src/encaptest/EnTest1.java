package encaptest;

public class EnTest1  {

	public static void main(String[] args) {
		
		
		EnTest1 ab = new EnTest1();
		
		ab.add(10, 20);
		
		
		
		/*ab.set(10);
		System.out.println(ab.get());*/

	}
	public void add(int a, int b)
	{
		System.out.println(a+a);
		System.out.println("I am from child class ");
	}

}
