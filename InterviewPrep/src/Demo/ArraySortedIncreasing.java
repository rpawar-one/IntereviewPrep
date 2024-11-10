package Demo;

public class ArraySortedIncreasing {
		
	int[] arr;
	public ArraySortedIncreasing(int[] arr)
	{
		this.arr=arr;
	}
	
	boolean isArraySortedIncreasing()
	{
		for(int i=1;i<arr.length; i++)
		{
			if(arr[i-1]>arr[i])
			{
				return false;
			}
		}
		return true;
	}
	
	boolean isArraySortedIncreasingQuadTime()
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					return false;
				}
			}
		}
		return true;
		
	}
}
