package Demo;

public class LeadersInArray {
	int[] arr;
	public LeadersInArray(int[] arr)
	{
		this.arr=arr;
	}
	
	public int[] findLeaders()
	{
		int res=0;
		int[] leaders=new int[arr.length];
		leaders[0]=arr[arr.length-1];
		for(int i=arr.length-1; i>=1; i--)
		{
			if(arr[i]<arr[i-1])
			{
				res++;
				leaders[res]=arr[i-1];
			}
		}
		return leaders;
	}
}


//[4, 5, 6, 10, 8, 7, 3]