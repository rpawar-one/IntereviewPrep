package Demo;

public class MoveZeroesToEndNaive {

	int[] arr;
	public MoveZeroesToEndNaive(int[] arr)
	{
		this.arr=arr;
	}
	
	int[] moveZeroesToEndNaive()
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				for(int j=i+1; j<arr.length;j++)
				{
					if(arr[j] !=0)
					{
						arr[i]=arr[j];
						arr[j]=0;
						break;
					}
				}
			}
		}

		return arr;
		
	}
	
}

//10 0 60 20 0 30 i=0
//10 60 0 20 0 30 i=1
//10 60 20 0 0 30 i=2
//10 60 20 0 30 0 i=2
//10 60 20 30 0 0 i=3
//10 60 20 30 0 0 i=4
//10 60 20 30 0 0 i=5