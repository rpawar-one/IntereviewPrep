package Demo;

//This is not the maximum occurrences of the 1.
//This is the number of sequences of 1
public class MaxConsecutiveOnes {
	int[] arr;
	public MaxConsecutiveOnes(int[] arr)
	{
		this.arr=arr;
	}
	
	public int maxOnes()
	{
		int count=0;
		int ptr=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1 && ptr==0)
			{
				ptr=1;
				count=count+ptr;
			}
			if(arr[i]==0 && ptr==1)
			{
				
				ptr=0;
				
			}
		}
		
		return count;
	}
}
