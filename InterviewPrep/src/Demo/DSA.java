package Demo;
import java.util.Arrays;

public class DSA {

	public static void main(String[] args) {
		System.out.println("Win");
		int[] arr = {4,2,3,7,6,5};
		int[] arr2 = {7,7,7,7,7};
		System.out.println("Input array; non-similar items "+Arrays.toString(arr));
		System.out.println("Input array; similar items "+Arrays.toString(arr2));
		LargestElementBrute l = new LargestElementBrute(arr);
		LargestElementBrute l2 = new LargestElementBrute(arr2);
		System.out.println("Largest using Brute force; non-similar item array "+l.largestElement());
		System.out.println("Largest using Brute force; similar item array "+l2.largestElement());
		LargestElementLinear linear = new LargestElementLinear(arr);
		System.out.println("Largest in linear time; non-similar item array "+linear.largestElement());
		LargestElementLinear linear2 = new LargestElementLinear(arr2);
		System.out.println("Largest in linear time; similar item array "+linear2.largestElement());
		SecondLargestNaive sl = new SecondLargestNaive(arr);
		System.out.println("Second largest by Naive method is: "+ sl.secondLargestNaive());
		SecondLargestNaive sl2 = new SecondLargestNaive(arr2);
		System.out.println("Second largest by Naive method with similar array elements is: "+ sl2.secondLargestNaive());
		SecondLargestEfficient sle = new SecondLargestEfficient(arr);
		System.out.println("Second largest by Efficient method with non-similar array elements is: "+sle.getSecondLargest());
		SecondLargestEfficient sle_2 = new SecondLargestEfficient(arr2);
		System.out.println("Second largest by Efficient method with similar array elements is: "+sle_2.getSecondLargest());
		int[] arr3= {8,12,45,49,96,110};
		int[] arr4 = {4,7,8,9,6,10,11,15};
		ArraySortedIncreasing as = new ArraySortedIncreasing(arr3);
		System.out.println("Is the array "+Arrays.toString(arr3)+" sorted in increasing order? "+as.isArraySortedIncreasing());
		ArraySortedIncreasing as2 = new ArraySortedIncreasing(arr4);
		System.out.println("Is the array "+Arrays.toString(arr4)+" sorted in increasing order? "+as2.isArraySortedIncreasing());
		ArraySortedIncreasing as3 = new ArraySortedIncreasing(arr2);
		System.out.println("Is the array "+Arrays.toString(arr2)+" sorted in increasing order? "+as3.isArraySortedIncreasing());
		System.out.println("Is the array "+Arrays.toString(arr3)+" sorted in increasing order, as checked in Quadratic time? "+as.isArraySortedIncreasingQuadTime());
		System.out.println("Is the array "+Arrays.toString(arr4)+" sorted in increasing order, as checked in Quadratic time? "+as2.isArraySortedIncreasingQuadTime());
		System.out.println("Is the array "+Arrays.toString(arr2)+" sorted in increasing order? as checked in Quadratic time? "+as3.isArraySortedIncreasingQuadTime());
		int[] arr5= {10,20,30,30,31,37,37,37,65,87,91,91,100};
		RemoveDuplicatesSortedArray rds=new RemoveDuplicatesSortedArray(arr5);
		System.out.println("The array "+Arrays.toString(arr5)+" after removing duplicates using auxilarry array");
		rds.removeDuplicateSorted();
		int[] arr6= {10,20,30,30,31,37,37,37,65,87,91,91,100};
		RemoveDuplicateSprtedSameArray rds_same=new RemoveDuplicateSprtedSameArray(arr6);
		System.out.println("The array "+Arrays.toString(arr6)+" after removing duplicates using same array");
		rds_same.removeDuplicateSameArray();
		//int[] arr7= {4,0,10,0,0,3,56,234,0,0,234,45};
		int[] arr7= {1,2,3,4,5,0,6,7,0,8,9,11};
		MoveZeroesToEnd mzend = new MoveZeroesToEnd(arr7);
		System.out.println("The array: "+Arrays.toString(arr7)+" After moving zeroes to end "+Arrays.toString(mzend.moveZeroesToEnd()));
		int[] arr8= {0,0,10,0,0,3,56,234,0,0,234,45};
		MoveZeroesToEndNaive mzend_nv = new MoveZeroesToEndNaive(arr8);
		System.out.println("The array: "+Arrays.toString(arr8)+" After moving zeroes to end using naive approach "+Arrays.toString(mzend_nv.moveZeroesToEndNaive()));
		int[] arr9= {1,2,3,4,5,6};
		LeftRotateByOne lr1 = new LeftRotateByOne(arr9);
		System.out.println("The array "+Arrays.toString(arr9)+" After rotating left by one place is "+Arrays.toString(lr1.leftRotateOne()));

	}	

}
