//Eric Voss
//envoss11@ole.augie.edu
//QuickSort.java

public class QuickSort 
{
	/**
	   Sorts an int array into ascending order<p>
	   <b>Post:</b><br>Elements in arr sorted in ascending order<p>
	 */
	public static void quickSort(int[] arr)
	{
		quickSort(arr,0,arr.length);
	}
	//Desc: Sorts an int array into ascending order
	//Pre:  arr[first]..arr[last-1] contain integers to be sorted
	//Post: arr[first]..arr[last-1] sorted in ascending order
	public static void quickSort(int[]arr,int first,int last)
	{
		if(last-first<=1)return;
		else if(last-first==2)
		{
			if(arr[last-1]<arr[first])
			{
				int temp=arr[last-1];
				arr[last-1]=arr[first];
				arr[first]=temp;
			}
			return;
		}
		else
		{
			int pivotLoc=rearrange(arr,first,last);
			quickSort(arr,first,pivotLoc);
			quickSort(arr,pivotLoc+1,last);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Pre:arr[first]..arr[last-1] contain integers
	//Post:arr[first]..arr[pivotLoc-1] <= arr[pivotLoc] <= arr[pivotLoc+1]..arr[last-1]
	//Return:pivotLoc
	private static int rearrange(int[] arr,int first, int last)
	{
		int mid=(last+first)/2;
		int pivot=arr[mid];
		arr[mid]=arr[first];
		arr[first]=pivot;
		int scanUp=first+1;
		int scanDown=last-1;
		while(true)
		{
			while((scanUp<=scanDown)&&(arr[scanUp]<=pivot))
				scanUp++;
			while((scanDown>=scanUp)&&(arr[scanDown]>=pivot))
				scanDown--;
			if(scanUp>scanDown)break;
			int temp=arr[scanUp];
			arr[scanUp]=arr[scanDown];
			arr[scanDown]=temp;
			scanUp++;
			scanDown--;
		}
		arr[first]=arr[scanDown];
		arr[scanDown]=pivot;
		return scanDown;
	}
	/**
	   Find the kth largest element in an int array <p>
	   <b>Post:</b><br>The elements in arr have been rearranged in such a way that
	           arr[k] now contains the kth largest element
	 */
	public static void findKth(int[] arr,int k)
	{
		findKth(arr,0,arr.length,k);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Pre: arr[first]..arr[last-1] contain integers
	//     k must be in [first..last-1]
	//Post:The elements in arr have been rearranged in such a way that arr[k] now contains
	//     the kth largest element
	public static void findKth(int[] arr,int first,int last,int k)
	{
		int pivotLoc=rearrange(arr,first,last);
		if(pivotLoc==k)return;
		else if(pivotLoc>k)findKth(arr,first,pivotLoc,k);
		else findKth(arr,pivotLoc+1,last,k);
	}
	public static void findKth(Object[]arr, int k)
	{
		findKth(arr,0,arr.length,k);
	}
	public static void findKth(Object[] arr,int first, int last,int k)
	{
		int pivotLoc=rearrange(arr,first,last);
		if(pivotLoc==k)return;
		else if(pivotLoc>k)findKth(arr,first,pivotLoc,k);
		else findKth(arr,pivotLoc+1,last,k);
	}
	public static <T extends Comparable<? super T>>void findKth(T[] arr,int k)
	{
		findKth(arr,0,arr.length,k);
	}
	public static <T extends Comparable<? super T>>void findKth(T[] arr,int first, int last, int k)
	{
		int pivotLoc=rearrange(arr,first,last);
		if(pivotLoc==k)return;
		else if(pivotLoc>k)findKth(arr,first,pivotLoc,k);
		else findKth(arr,pivotLoc+1,last,k);
	}
	public static void quickSort(Object[] arr)
	{
		quickSort(arr,0,arr.length);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void quickSort(Object[] arr,int first,int last)
	{
		if(last-first<=1)return;
		else if(last-first==2)
		{
			if(((Comparable)arr[last-1]).compareTo(arr[first])<0)
			{
				Object temp=arr[last-1];
				arr[last-1]=arr[first];
				arr[first]=temp;
			}
			return;
		}
		else
		{
			int pivotLoc=rearrange(arr,first,last);
			quickSort(arr,first,pivotLoc);
			quickSort(arr,pivotLoc+1,last);
		}
	}
	public static int rearrange(Object[]arr, int first, int last)
	{
		int mid=(last+first)/2;
		Object pivot=arr[mid];
		arr[mid]=arr[first];
		arr[first]=pivot;
		int scanUp=first+1;
		int scanDown=last-1;
		while(true)
		{
			while((scanUp<=scanDown)&&(((Comparable)arr[scanUp]).compareTo(pivot))<=0)
				scanUp++;
			while((scanDown>=scanUp)&&(((Comparable)arr[scanDown]).compareTo(pivot))>=0)
					scanDown--;
			if(scanUp>scanDown)break;
			Object temp=arr[scanUp];
			arr[scanUp]=arr[scanDown];
			arr[scanDown]=temp;
			scanUp++;
			scanDown--;
		}
		arr[first]=arr[scanDown];
		arr[scanDown]=pivot;
		return scanDown;
	}
	public static <T extends Comparable<? super T>> void quickSort(T[] arr)
	{
		quickSort(arr,0,arr.length);
	}
	
	
	
	
	
	
	
	
	
	
	public static <T extends Comparable<? super T>> void quickSort(T[] arr,int first,int last)
	{
		if(last-first<=1)return;
		else if(last-first==2)
		{
			if((arr[last-1]).compareTo(arr[first])<0)
			{
				T temp=arr[last-1];
				arr[last-1]=arr[first];
				arr[first]=temp;
			}
			return;
		}
		else
		{
			int pivotLoc=rearrange(arr,first,last);
			quickSort(arr,first,pivotLoc);
			quickSort(arr,pivotLoc+1,last);
		}
	}
}
