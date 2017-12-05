
import java.util.*;
import java.io.*;

public class prob06{
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob06.txt"));
		int amt = in.nextInt();
		in.nextLine();
		for (int i = 0; i<amt;i++)
		{
		int count = in.nextInt();
		int start = in.nextInt();
		int temp = start;
		ArrayList<Integer> deltas = new ArrayList<Integer>();
		for(int q = 1;q<count;q++)
		{
			int next = in.nextInt();
			deltas.add(next-temp);
			temp=next;
		}

		for(int k = 0;k<deltas.size();k++)
		{
			deltas.set(k, deltas.get(k)*-1);
		}
		
		//System.out.println(deltas);
		ArrayList<Integer> inverseDelta = new ArrayList<Integer>();
		inverseDelta.add(start);
		for(int j = 0;j<deltas.size();j++)
		{
			inverseDelta.add(inverseDelta.get(j)+deltas.get(j));
		}
		for(int e:inverseDelta)
		System.out.print(e+" ");
		System.out.println();
		}
	}

}