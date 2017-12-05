
import java.util.*;
import java.io.*;

public class prob19{
	
	public static void main(String arg[]) throws IOException
	{
		Scanner in = new Scanner(new File("prob19.txt"));
		int numCal = in.nextInt();
		int numTests = in.nextInt();
		in.nextLine();
		int[][] calArray = new int[numCal][2]; 
		for(int i =0; i < numCal; i++){
			String calLine = in.nextLine();
			Scanner calLineScan = new Scanner(calLine);
			calArray[i][0] = calLineScan.nextInt();
			calArray[i][1] = calLineScan.nextInt();
		}
		
		double[] kVals = new double[numCal-1];
		for(int i = 0; i < numCal-1; i++){
			String firstCal = calArray[i][0]+" "+ calArray[i][1];
			String secondCal = calArray[i+1][0]+" "+ calArray[i+1][1];
			int sFar, sNear, vFar, vNear;
			if(Integer.parseInt(firstCal.substring(0, 1))>Integer.parseInt(secondCal.substring(0, 1))){
				sFar = Integer.parseInt(firstCal.substring(0,firstCal.indexOf(" ")));
				sNear = Integer.parseInt(secondCal.substring(0,secondCal.indexOf(" ")));
				vFar = Integer.parseInt(firstCal.substring(firstCal.lastIndexOf(" ")+1));
				vNear = Integer.parseInt(secondCal.substring(secondCal.lastIndexOf(" ")+1));
			}else{
				sFar = Integer.parseInt(secondCal.substring(0,secondCal.indexOf(" ")));
				sNear = Integer.parseInt(firstCal.substring(0,firstCal.indexOf(" ")));
				vFar = Integer.parseInt(secondCal.substring(secondCal.lastIndexOf(" ")+1));
				vNear = Integer.parseInt(firstCal.substring(firstCal.lastIndexOf(" ")+1));
			}
			double k = (sFar-sNear) / ( (1/(Math.sqrt(vFar))) - (1/(Math.sqrt(vNear))));
			kVals[i] = k;
			
		}
		
		double sum = 0;
		for(int i = 0; i < kVals.length; i++){
			sum+=kVals[i];
		}
		double kAvg = sum/kVals.length;
		
		///////////////////////////////////////////////
		
		double[] eVals = new double[numCal];
		for(int i = 0; i < numCal; i++){
			String firstCal = calArray[i][0]+" "+ calArray[i][1];
			int s = Integer.parseInt(firstCal.substring(0,firstCal.indexOf(" ")));
			int v = Integer.parseInt(firstCal.substring(firstCal.lastIndexOf(" ")+1));
			//System.out.println(s+ " "+ v);
			
			double e = (kAvg/Math.sqrt(v)) - s;
			eVals[i] = e;
			//System.out.println(e);
		}
		
		double eSum = 0;
		for(int i = 0; i < eVals.length; i++){
			eSum += eVals[i];
		}
		double eAvg =eSum/eVals.length;
	
		int[] testVals = new int[numTests];
		for(int z = 0; z<numTests;z++){
			testVals[z] = in.nextInt();
		}
		
		System.out.println("k = "+ kAvg);
		System.out.println("e = "+ eAvg);
		
		for(int g = 0; g< numTests;g++){
			double finalS = kAvg / Math.sqrt(testVals[g]) - eAvg;
			System.out.println(testVals[g]+" "+finalS);
		}
		
	}
}

/*
  for(int i = 0; i < calArray.length; i++){
			for(int j = 0; j< calArray[0].length; j++){
				System.out.print(calArray[i][j]+" ");
			}
			System.out.println();
		}
*/