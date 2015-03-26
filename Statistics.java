//Eric Voss
//envoss11@ole.augie.edu
//Statistics.java

import java.util.*;

public class Statistics
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter scores, -1 to end: ");
		int score=0;
		Vector<Integer> testScores=new Vector<Integer>();
		while(true)
		{
			score=input.nextInt();
			if(score==-1)break;
			testScores.add(score);
		}
		int[] scores=new int[testScores.size()];
		int total=0;
		for(int i=0;i<scores.length;++i)
		{
			scores[i]=testScores.get(i);
			total+=scores[i];
		}
		double average=(double)total/scores.length;
		int high=scores.length-1;
		int low=0;
		int median=scores.length/2;
		QuickSort.findKth(scores,high);
		System.out.println("High: "+scores[high]);
		QuickSort.findKth(scores,low);
		System.out.println("Low: "+scores[low]);
		QuickSort.findKth(scores,median);
		System.out.println("Median: "+scores[median]);
		System.out.printf("Average: %.2f",average);
	}

}

