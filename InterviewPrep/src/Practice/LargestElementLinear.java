package Practice;

public class LargestElementLinear {
	int[] arr;
	public LargestElementLinear(int[] arr){
		this.arr=arr;
	}
	
	public int largestElementLinear()
	{
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}

}
