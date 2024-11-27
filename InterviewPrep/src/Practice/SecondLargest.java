package Practice;

public class SecondLargest {
	int[] arr;
	public SecondLargest(int[] arr) {
		this.arr=arr;
	}
	
	public int secondLargestElement() {
		int secondLargest=-1;
		int largest=arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if (arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else {
				if(arr[i]>secondLargest || arr[i]==-1) {
					secondLargest=arr[i];
				}
			}
		}
		
		return secondLargest;
	}
}
