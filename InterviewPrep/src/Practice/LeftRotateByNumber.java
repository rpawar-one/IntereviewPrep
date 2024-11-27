package Practice;

public class LeftRotateByNumber {
	//1,2,3,4,5,6
	int number;
	int[] arr;
	public LeftRotateByNumber(int number,int[] arr) {
		this.arr=arr;
		this.number=number;
	}
	
	public int[] leftRotateByNumber() {
		number=number%arr.length;
		int[] temp= new int[number];
		for(int i=0;i<number;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=number;i<arr.length;i++) {
			arr[i-number]=arr[i];
		}
		
		for(int i=0;i<number;i++) {
			arr[arr.length-number+i]=temp[i];
		}
		
		return arr;
	}
}
