package Demo;

public class LargestElementBrute {

	int[] arr;
	public LargestElementBrute(int[] arr) {
		this.arr=arr;
	}
	int largestElement()
	{
		int[] arr;
		arr=this.arr;
		for (int element : arr) {
			for (int element2 : arr) {
				if(element2 >= element)
				{
					break;
					
				}
				return element;
				
			}
		}
		return -1;
	}
}
