package Demo;

public class SortedFrequency {
	int[] arr;
	public SortedFrequency(int[] arr)
	{
		this.arr=arr;
	}
	
	public void frequencyCalc()
	{
		int freq=1;
		int i=1;
		while(i<arr.length)
		{
			if(arr[i]==arr[i-1])
			{
				freq++;
				i++;	
			}
			else
			{
				System.out.println("The frequency of "+arr[i-1]+" is "+freq);
				freq=1;
				i++;
			}
		}
		if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2])
		{
			System.out.println("The frequency of "+arr[arr.length-1]+" is "+1);
		}
	}

}
