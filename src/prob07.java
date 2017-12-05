
import java.util.*;
import java.io.*;

public class prob07{
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob07.txt"));
		int amt = in.nextInt();
		in.nextLine();
		for (int i = 0; i<amt;i++)
		{
			String line = in.nextLine();
			//System.out.println(i);
			
			Scanner lineScan = new Scanner(line);
			int n = 0;
			double xP = 0;
			double xN = lineScan.nextInt();
			int A = lineScan.nextInt();
			int B = lineScan.nextInt();
			int C = lineScan.nextInt();
			int M = lineScan.nextInt();
			int N = lineScan.nextInt();
			double targetError = lineScan.nextDouble();
			double currentError = 0;
			
			do{
				n++;
				if(n>100){
					break;
				}
					
				xP = xN;
				xN = C + (A * xN + M) / ( B * xN + N);
				currentError = Math.abs(xN - xP);
				//System.out.println(currentError);
				
			}while(currentError > targetError);
			
			if(n>100)
				System.out.println("DIVERGES");
			else
			{
				/*
				String s = "" +targetError;
				int desired = s.length()-2;
				String f = "%1."+desired+"f";
				System.out.printf(f,xN);
				*/
				System.out.printf("%1.6f%1s",xN,"\n");
			}
		}
		
	}

}