package Practice;
import java.util.Arrays;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from practice session");
		int[] arr1 = {2,3,5,4,1};
		LargestElementBrute leb = new LargestElementBrute(arr1);
		System.out.println("Array: "+Arrays.toString(arr1)+" Largest: "+leb.largestBrute());
		LargestElementLinear lel = new LargestElementLinear(arr1);
		System.out.println("Array: "+Arrays.toString(arr1)+" Largest in Linear time: "+lel.largestElementLinear());
		SecondLargest sl = new SecondLargest(arr1);
		System.out.println("Array: "+Arrays.toString(arr1)+" Second Largest in Linear time: "+sl.secondLargestElement());
		int[] arr2 = {4,5,6,10,8,7,3};
		LeadersInArray lir = new LeadersInArray(arr2);
		System.out.println("Array: "+Arrays.toString(arr2)+" Leaders in array: "+lir.findLeaders());
		int[] arr3 = {1,2,3,4,5,6};
		LeftRotateByOne lro = new LeftRotateByOne(arr3);
		System.out.println("Array: "+Arrays.toString(arr3)+" Left Rotated by one: "+Arrays.toString(lro.leftRotate()));
		int[] arr4 = {1,2,3,4,5,6};
		LeftRotateByNumber lrbn = new LeftRotateByNumber(10,arr4);
		System.out.println("Array :"+Arrays.toString(arr4)+" Left rotated by 2 "+Arrays.toString(lrbn.leftRotateByNumber()));
		int[] arr5= {1,0,1,1,0,0,1,1,1,0,1,0,1,1};
		MaxConsecutiveOnes mco = new MaxConsecutiveOnes(arr5);
		System.out.println("Array :"+Arrays.toString(arr5)+" Max consecutive ones: "+mco.maxConsecutiveOnes());
		int[] arr6= {2,3,10,6,4,8,1};
		MaxDiffLinear mdl = new MaxDiffLinear(arr6);
		System.out.println("Array: "+Arrays.toString(arr6)+" max difference: "+mdl.differenceLinearTime());
		int[] arr7= {9,3,10,2,6,4,11,1};
		MaxDiffLinear mdl2 = new MaxDiffLinear(arr7);
		System.out.println("Array: "+Arrays.toString(arr7)+" max difference: "+mdl2.differenceLinearTime());
	}

}
