package Demo;
import java.util.Arrays;

public class DSA {

	public static void main(String[] args) {
		System.out.println("W");
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

	}

}
