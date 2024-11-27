package Practice;

public class LeftRotateByOne {
	//1,2,3,4,5,6
	int[] arr;
	public LeftRotateByOne(int[] arr) {
		this.arr=arr;
	}
	
	public int[] leftRotate() {
		int x=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=x;
		
		return arr;
	}
}
