package Demo;
import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
	
	int[] arr;
	public RemoveDuplicatesSortedArray(int[] arr)
	{
		this.arr=arr;
	}
	
	public void removeDuplicateSorted()
	{
		int[] temp=new int[arr.length];
		temp[0]=arr[0];
		int res=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				temp[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i<=res)
				{
				arr[i]=temp[i];
				}
			else
			{
				arr[i]=0;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
