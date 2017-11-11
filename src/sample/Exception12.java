package sample;

import java.io.IOException;

public class Exception12 {

	public static void main(String[] args) throws IOException, InterruptedException,Exception{
		
		
		
		
		
		try 
		{
			System.out.println(100/20);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("done");
		}
		
		
	}

}
