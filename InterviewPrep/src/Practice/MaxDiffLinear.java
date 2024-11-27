package Practice;
//{9,3,10,2,6,4,11,1};

public class MaxDiffLinear {
	int[] arr;
	public MaxDiffLinear(int[] arr) {
		this.arr=arr;
	}
	
	public int differenceLinearTime() {
		int diff=0;
		int smallest=arr[0];
		int maxDiff=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
			diff=arr[i]-smallest;
			maxDiff=Math.max(diff, maxDiff);
		}
		
		return maxDiff;
	}

}
