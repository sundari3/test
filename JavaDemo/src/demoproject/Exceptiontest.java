package demoproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Exceptiontest {
public static void main(String args[])
{
	try {
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
		
		//File f1=new File("C:\\abc.txt");
		
		
		
	
		
		
	} 
	/*catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println("This is Arithmetic exception:");
		e.printStackTrace();
	}*/
	catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("This is exception:");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}


}
