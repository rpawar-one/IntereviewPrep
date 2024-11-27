package Demo;

public class MaxLengthEvenOddLinear {
	int[] arr;
	public MaxLengthEvenOddLinear(int[] arr) {
		this.arr=arr;
	}
	
	public int maxLengthEvenOddLinear()
	{
		int result=1;
		int current=1;
		for (int i=1;i<arr.length;i++) {
			
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)) {
				current++;
				result=Math.max(result,current);
			}
			else {
			current=1;
			}
		}
				
		return result;
	}

}

//5,10,20,7,3,8