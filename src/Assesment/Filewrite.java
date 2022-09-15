package Assesment;

import java.io.FileWriter;

public class Filewrite {

	public static void main(String[] args) 
	{
		try
		{
			FileWriter myWriter = new FileWriter("Example.txt");
			myWriter.write("Hai");
			myWriter.write("Welcome to home");
			myWriter.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
	

			
		
	