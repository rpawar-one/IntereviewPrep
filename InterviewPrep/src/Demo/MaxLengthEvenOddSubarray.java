package Demo;

//5,10,20,6,3,8

public class MaxLengthEvenOddSubarray {
	int[] arr;
	public MaxLengthEvenOddSubarray(int[] arr) {
		this.arr=arr;
	}
	
	public int MaxEvenOddLength() {
		int result=1;
		for (int i=0;i<arr.length;i++) {
			int current=1;
			for (int j=i+1;j<arr.length;j++) {
				if((arr[j]%2 == 0) && (arr[j-1]%2 ==1) || (arr[j]%2 == 1) && (arr[j-1]%2 ==0)) {
					current++;
				}
				else
				{
					break;
				}
				result=Math.max(current, result);
			}
		}
		
		
		
		return result;
	}

}
