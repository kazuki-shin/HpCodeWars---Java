import java.util.*;
import java.io.*;

public class prob03 {
	
	public static void main(String arg[]) throws IOException
	{
		

			
		Scanner in = new Scanner(new File("prob03.txt"));
		for (int i = 0; i <3;i++)
		{
		
		double m = in.nextInt();
		
		System.out.println(m * .299792);
		}
	}

}