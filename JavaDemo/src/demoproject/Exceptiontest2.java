package demoproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Exceptiontest2 {
public static void main(String args[])
{
	File f = new File("C://ts.txt");
	
	try {
		FileInputStream fi = new FileInputStream(f);
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("end");
	

}


}
