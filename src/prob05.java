import java.util.*;
import java.io.*;

public class prob05 {
	
	public static void main(String arg[]) throws IOException
	{		
		Scanner in = new Scanner(new File("prob05.txt"));
		int amt = in.nextInt();
		in.nextLine();
		double min = Double.MAX_VALUE;
		double speed = 0.0;
		String name = "";
		for (int i = 0; i <amt;i++)
		{
			String temp = in.next();
			Double temp2 = in.nextDouble();
			if (temp2 < min) 
			{
				min = temp2;
				name = temp;
				speed = in.nextDouble();
			}
			in.nextLine();
				
		}
		
		
		System.out.printf(name + " ");
		System.out.printf("%1.3f",min/speed);
	}

}