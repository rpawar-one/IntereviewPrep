package Demo;

public class MaxSumSubarray {
	int[] arr;
	public MaxSumSubarray(int[] arr) {
		this.arr=arr;
	}
	
	public int maxSumOfSubarray()
	{
		int result=arr[0];
		int maxSumEndingatLoc=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			maxSumEndingatLoc=Math.max(maxSumEndingatLoc+arr[i], arr[i]);
			result=Math.max(maxSumEndingatLoc,result);
		}
		 			
		return result;
	}
}
