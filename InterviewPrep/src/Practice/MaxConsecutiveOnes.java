package Practice;

//1,0,1,1,0,0,1,1,1,0,1,0,1,1

public class MaxConsecutiveOnes {
	int[] arr;
	public MaxConsecutiveOnes(int[] arr) {
		this.arr=arr;
	}
	
	public int maxConsecutiveOnes()
	{
		int max=0;
		int globalMax=0;
		if(arr[0]==1)
		{
			max++;
			globalMax++;
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				max=0;
			}
			else {
				max++;
				globalMax=Math.max(max, globalMax);
			}
		}
		return globalMax;
	}
}
