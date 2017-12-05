
import java.util.*;
import java.io.*;

public class prob04 {
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob04.txt"));
		int amt = in.nextInt();
		in.nextLine();
		for (int i = 0; i<amt;i++)
		{
			
		double m = in.nextDouble();
		double v = in.nextDouble();
		
		System.out.println(m / (v/60));
		}
	}

}