package Demo;

public class SecondLargestNaive {
	
	int[] arr;
	public SecondLargestNaive(int[] arr)
	{
		this.arr=arr;
	}
	
	int secondLargestNaive()
	{
		int[] arr=this.arr;
		int largest=arr[0];
		int secondLarge=-1;
		for(int element: arr)
		{
			if(element>largest)
			{
				largest=element;
			}
		}
		for(int element:arr)
		{
			if(element != largest )
			{
				if (secondLarge == -1)
				{
					secondLarge = element;
				}
				else if (element > secondLarge)
				{
					secondLarge = element;
				}
			}
		}

		return secondLarge;
	}

}
