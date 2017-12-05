
import java.util.*;
import java.io.*;

public class prob08 {
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob08-1-in.txt"));

				;
		while (in.hasNextInt())
		{
			long counterA = 0	;		long counterB = 1;
			
			long A = in.nextLong();
			long B = in.nextLong();
			//long dif = B-A;
			//long avg = dif / 4;
			
			//counter += avg * 2;
			//long a1 = A + (B-A)/4*4;
			
			
			counterA += A/4*2;
			counterB += B/4*2;
			long a1 = A/4*4;
			long b1 = B/4*4;
		//	System.out.println(b1+ " " +B);
			for (long i = a1; i<=A; i++)
			{
				//System.out.println(a1+" "+i+" "+A);
				String temp = Long.toString(i, 2);
				temp = temp.replaceAll("0", "");
				if (temp.length() % 2 == 0)
					counterA++;
				//System.out.println("hello1");
			}
			for (long i = b1; i<=B; i++)
			{
				String temp = Long.toString(i, 2);
				temp = temp.replaceAll("0", "");
				if (temp.length() % 2 == 0)
					counterB++;
			}
			//if(A%2==0&&B%2==1)counterB--;
			if(A!=0 || B!=0)
			System.out.println(counterB-counterA);
			
		}
		/*
		for (int i = 0; i < 5; i++)
		{
		String temp = Integer.toString(i, 2);
		temp = temp.replaceAll("0", "");
		System.out.println(temp);
		}*/
		
	}
}