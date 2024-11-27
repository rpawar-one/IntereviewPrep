package Demo;

public class MaxOnesBinaryArray {
	int[] arr;
	public MaxOnesBinaryArray(int[] arr) {
		this.arr=arr;
	}
	
	int MaxNumberOfOnes()
	{
		int current=0;
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1) {
				current++;
				result=Math.max(result, current);
			}
			if(arr[i]==0) {
				current=0;
			}
		}
			return result;
	}
}
