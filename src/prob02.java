import java.util.*;
import java.io.*;

public class prob02 {
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob02.txt"));
		
		int m = in.nextInt();
		int v = in.nextInt();
		
		System.out.println(m*v);
	}

}
