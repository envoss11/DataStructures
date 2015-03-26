//Eric Voss
//envoss11@ole.augie.edu
//Driver.java

public class Driver 
{
	public static void main(String[] args) 
	{
		String[] stringArr={"John","Paul","George","Ringo"};
		QuickSort.quickSort(stringArr);
		for(int i=0;i<stringArr.length;++i)
		{
			System.out.println(stringArr[i]);
		}
		Object[] objArr={"John","Paul","George","Ringo"};
		QuickSort.quickSort(objArr);
		System.out.println();
		for(int i=0;i<objArr.length;++i)
		{
			System.out.println(objArr[i]);
		}
		System.out.println();
		Integer[] integerArr={3,7,1,12,9};
		int highest=integerArr.length-1;
		QuickSort.findKth(integerArr,highest);
		System.out.println("Largest:"+integerArr[highest]);
		Object[] objectArr={3,7,1,12,9};
		QuickSort.findKth(objectArr, highest);
		System.out.println("Largest:"+objectArr[highest]);
	}
}
