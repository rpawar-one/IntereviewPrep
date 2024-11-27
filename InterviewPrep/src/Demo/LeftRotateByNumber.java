package Demo;

public class LeftRotateByNumber {
	int[] arr;
	int num;
	public LeftRotateByNumber(int[] arr)
	{
		this.arr=arr;
	}
	
	public int[] LeftRotateByNumberForLoop(int num)
	{
		for(int i=0;i<num;i++)
		{
			LeftRotateByOne l = new LeftRotateByOne(arr);
			l.leftRotateOne();
		}
		return arr;
	}

}
