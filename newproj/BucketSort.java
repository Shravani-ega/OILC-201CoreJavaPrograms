package newproj;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BucketSort {

	static void bucket(int[] arr) {

		int max = max(arr);
		int min = min(arr);
		int range = (max - min);
		int bucketSize = (int) Math.sqrt(range) + 1;

		List[] buckets = new List[bucketSize];

		for (int i = 0; i < bucketSize; i++) {
			buckets[i] = new LinkedList<>();
		}
		for (int num : arr) {
			buckets[num / bucketSize].add(num);
		}
		for (List<Integer> bucket : buckets) {
			Collections.sort(bucket);
		}

		int index = 0;
		for (List<Integer> bucket : buckets) {
			for (int num : bucket) {
				arr[index++] = num;
			}
		}
	}

	static int max(int[] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	static int min(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array :");
		int arraySize = sc.nextInt();
		int arr[] = new int[arraySize];
		System.out.println("Enter " + arraySize + " Elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		bucket(arr);
		System.out.println(Arrays.toString(arr));
	}

}
