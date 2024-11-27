package Demo;

public class MaxSumCircularSubarray {
	int[] arr;
	public MaxSumCircularSubarray(int[] arr) {
		this.arr=arr;
	}
	
	int maxSumCircularBrute() {
		int globalMax=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int currMax=arr[i];
			for(int j=1;j<arr.length;j++)
			{
				int index=(i+j)%arr.length;
				currMax=Math.max(currMax, arr[index]+currMax);
				globalMax=Math.max(currMax, globalMax);
			}
		}
		
		return globalMax;
	}
}




//0,1,2,3
//0,1,2,3
//5,2,-3,4
//(i+j)%n 
//i=0;i<n
//j=1;j<n
//iter 1 : i=0;  curr(5)	+	arr[0+1]%4 = arr[1];(5+2=7)	  arr[0+2]%4 = arr[2];(7-3=4)    arr[0+3]%4 = arr[3];(4+4=8)  res=8; curr_max=8
//iter 2 : i=1;  curr(2)	+   arr[1+1]%4 = arr[2];(2-3=-1)  arr[1+2]%4 = arr[3];(-1+4=3)   arr[1+3]%4 = arr[0];(3+5=8)  res=8; curr_max=8
//iter 3 : i=2   curr(-3)   +   arr[2+1]%4 = arr[3];(-3+4=1)  arr[2+2]%4 = arr[0];(1+5=6)    arr[2+3]%4 = arr[1];(6+2=8)  res=8; curr_max=8
//iter 4:  i=3   curr(4)    +   arr[3+1]%4 = arr[0];(4+5=9)   arr[3+2]%4 = arr[1];(9+2=11)   arr[3+3]%4 = arr[2];(11-3=8) res=11; curr_max=11