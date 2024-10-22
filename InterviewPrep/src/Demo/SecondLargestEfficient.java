package Demo;

public class SecondLargestEfficient {
	
	int[] arr;
	public SecondLargestEfficient(int[] arr)
	{
		this.arr=arr;
	}

	int getSecondLargest() {
		
		int largest=arr[0];
		int s_largest=-1;
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				s_largest=largest;
				largest=arr[i];
			}
			else if(arr[i] < largest )
			{
				if(s_largest == -1 | arr[i] > s_largest )
				{
					s_largest=arr[i];
				}
			}
		}
		return s_largest;
	}
}
