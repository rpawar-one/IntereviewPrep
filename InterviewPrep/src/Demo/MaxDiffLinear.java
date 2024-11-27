package Demo;

public class MaxDiffLinear {
	int[] arr;
	public MaxDiffLinear(int[] arr) {
		this.arr=arr;
	}
	
	public int maxDiffLinear()
	{
		int diff = arr[1]-arr[0];
		int curr_small=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]<curr_small)
			{
				curr_small=arr[j];
			}
			if(diff<(arr[j]-curr_small))
			{
				diff=arr[j]-curr_small;
			}
		}
		
		return diff;
	}
}
