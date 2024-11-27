package Practice;
import java.util.ArrayList;

public class LeadersInArray {
	int[] arr;
	public LeadersInArray(int[] arr) {
		this.arr=arr;
	}
	
	//4,5,6,10,8,7,3
	
	public ArrayList<Integer> findLeaders()
	{
		ArrayList<Integer> leaders = new ArrayList<Integer>();
		leaders.add(arr[arr.length-1]);
		for (int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>arr[i+1]) {
				leaders.add(arr[i]);
			}
		}
		
		return leaders;
	}

}
