package Practice;

public class LargestElementBrute {
	int[] arr;
	public LargestElementBrute(int[] arr) {
		this.arr=arr;
	}
	
		public int largestBrute()
		{
			for(int i=0;i<arr.length;i++) {
				boolean isLargest=true;
				for(int j=0;j<arr.length;j++) {
					if(arr[j]>arr[i])
					{
						isLargest=false;
						break;
					}
				}
				if(isLargest==true)
				{
					return arr[i];
				}
			}
						
		return -1;
		}
	}
