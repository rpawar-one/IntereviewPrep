package Demo;

public class MaxSubarrayCircularSumKadane {
	int[] arr;
	public MaxSubarrayCircularSumKadane(int[] arr) {
		this.arr=arr;
	}
	
	public int maxCircularSubarraySumKadane() {
		
		int globalMax=arr[0];
		int globalMin=arr[0];
		int currMin=arr[0];
		int currMax=arr[0];
		int total=arr[0];
		int result=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			currMax=Math.max(currMax+arr[i],arr[i]);
			currMin=Math.min(currMin+arr[i], arr[i]);
			globalMax=Math.max(currMax, globalMax);
			globalMin=Math.min(currMin, globalMin);
			total+=arr[i];
			if(globalMax>0) {
				result=Math.max(total-globalMin,globalMax);
			}
			else {
				result=globalMax;
			}
		}
		
		return result;
	}

}
