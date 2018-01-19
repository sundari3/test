package encaptest;

public class poly {
public static void main(String args[])
{
	String a="10", b="20",c;
	System.out.println(c=a+b);
	poly obj = new poly();
	obj.add(10f, 10f);
			
	
}
public void add(int a, int b) {
	System.out.println(a+b);
}
public void add(float a, float b) {
	System.out.println(a+b);
}
}

