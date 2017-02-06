/**
 * 
 */
package mrm.learn;

import java.util.Arrays;
import java.util.SortedSet;

/**
 * Implements Array related functionalities
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//sortIntAttay
		int[] sortedIntArr = sortIntArray(getIntArrays());
		System.out.println("Sorted Int Array : "+Arrays.toString(sortedIntArr)); // uses StringBuilder and its append method in the background.
		
		//sortStringArray
		String[] sortStrArr = sortStringArray(getStringArrays());
		System.out.println("Sorted String Array : "+ Arrays.toString(sortStrArr));
	}

	private static String[] sortStringArray(String[] stringArrays) {
		Arrays.sort(stringArrays); // uses merge sort behind the scene
		return stringArrays;
	}

	private static String[] getStringArrays() {
		String[] strArr = {"sachin","viru","dravid","ganguly","yuvraj","dhoni","ashwin","jadeja","harbhajan","kumar"};
		return strArr;
	}

	private static int[] sortIntArray(int[] intArrays) {
		Arrays.sort(intArrays);
		return intArrays;
	}

	private static int[] getIntArrays() {
		int[] numArr = {99,11,88,22,77,33,66,44,55,1,32};
		return numArr;
	}

}
