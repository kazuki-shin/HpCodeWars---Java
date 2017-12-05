
import java.util.*;
import java.io.*;

public class prob15 {
	public static final int[] L = {1, 2, 3, 4, 5, 6};
	public static final int[] F = {0,1,1,2,3,5};
	public static final int[] T = {0,0,1,1,2,4};
	public static final int[] N={1,2,2,3,3,4};
	public static final int[] P = {0,1,2,3,5,7};
	public static final int[] C={1,2,3,3,4,5};
	
	static void main(String arg[]) throws IOException
	{
		
		
		Scanner in = new Scanner(new File(".txt"));
		while(in.hasNextLine())
		{
			String d1 = in.next();
			String d2 = in.next();
			String d3 = in.next();
			int t1 = Integer.parseInt(in.next());
			int t2 = Integer.parseInt(in.next());
			int t3 = Integer.parseInt(in.next());
			Map<Integer,Integer> sol = new HashMap<Integer,Integer>(); 
			if(d3.equals("X")||d1.equals("X")||d2.equals("X"))
			{
				switch(d1)
				{
				
				}
			}
		}
		
	}
}