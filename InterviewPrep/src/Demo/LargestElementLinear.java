package Demo;

public class LargestElementLinear {
	
	int[] arr;
	public LargestElementLinear(int[] arr)
	{
		this.arr=arr;
	}
	
	int largestElement()
	{
		int[] arr = this.arr;
		int largest=arr[0];
		int similar =0;
		for(int element:arr)
		{
			if (element>largest)
			{
				largest=element;
			}
			else if (element == arr[0])
			{
				similar++;
			}
		}
		if(similar == arr.length)
		{
			return -1;
		}
		return largest;
	}
}
