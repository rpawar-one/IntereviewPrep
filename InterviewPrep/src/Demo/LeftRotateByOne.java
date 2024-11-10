package Demo;

public class LeftRotateByOne {
	int[] arr;
	public LeftRotateByOne(int[] arr)
	{this.arr=arr;}
	
	public int[] leftRotateOne()
	{
		int temp=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

}
