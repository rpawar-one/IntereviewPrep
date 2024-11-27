package Demo;

public class MaxDiffNaive {
	
	int[] arr;
	public MaxDiffNaive(int[] arr)
	{
		this.arr=arr;
	}
	
	public int maxDifferenceNaive()
	{
		int diff=arr[1]-arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[j]-arr[i])>diff)
				{
					diff=arr[j]-arr[i];
				}
			}
		}
		
		
		return diff;
	}

}
