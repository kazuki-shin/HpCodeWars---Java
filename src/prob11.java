
import java.util.*;
import java.io.*;

public class prob11{
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob11.txt"));
		int row = in.nextInt();
		int col = in.nextInt();
		int noise = in.nextInt();
		in.nextLine();
		int count = in.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i<count;i++)
		{
			queue.add(in.nextInt());
			
		}
		in.nextLine();
		ArrayList<String> letters = new ArrayList<String>();
		for(int y = 0;y<row;y++)
			for(int x = 0;x<col;x++)
			{
				letters.add(in.next());
			}
		Map<String, Integer> occ = new HashMap<String,Integer>();
		for(String s:letters)
		{
			if(occ.containsKey(s))occ.put(s, occ.get(s)+1);
			else occ.put(s, 1);
			
		}
		
		for(int j = 0;j<letters.size();j++)
		{
			if(occ.get(letters.get(j))>=noise){letters.remove(j);j--;}
			
		}
		//System.out.println(occ);
		String ret = "";
		int word = 0;
		for(String s:letters)
		{
			
			ret+=s;
			word++;
			if(word==queue.peek())
			{
				word=0;
				queue.poll();
				ret+=" ";
			}
			
		}
		System.out.println(ret);
	}
}