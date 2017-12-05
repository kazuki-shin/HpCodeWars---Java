import java.util.*;
import java.io.*;

public class prob01 {
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob01.txt"));
		
		String x = in.next();
		
		System.out.println("Hello my new friend, " + x + ".");
	}

}
