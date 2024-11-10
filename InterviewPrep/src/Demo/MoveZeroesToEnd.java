 package Demo;

public class MoveZeroesToEnd {

	int[] arr;
	public MoveZeroesToEnd(int[] arr)
	{
		this.arr=arr;
	}
	
	int[] moveZeroesToEnd()
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[res]=arr[i];
				if(i>res)
				{
				arr[i]=0;
				}
				res++;
			}
		}
		
		/*
		 * for (int i=0; i<arr.length; i++) { if(i>=res) { arr[i]=0; } }
		 */
		
		return arr;
	}
}
