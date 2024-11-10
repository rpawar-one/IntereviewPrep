package Demo;

import java.util.Arrays;

public class RemoveDuplicateSprtedSameArray {
	int[] arr;
	public RemoveDuplicateSprtedSameArray(int[] arr)
	{
		this.arr=arr;
	}
	
	public void removeDuplicateSameArray()
	{
	int res=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i>res)
			{
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
