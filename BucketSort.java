/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Stable? No
 */

import java.util.*;

public class BucketSort {
	
	
	public void bucketSort(double[] nums) {
		int numsPointer = 0;
		List[] buckets = new List[10];
		
		//Create 10 lists
		for(int i=0;i<10;i++)
			buckets[i] = new ArrayList<Integer>();
		
		//Distribute the values in the range
		for(double x:nums) {
			int bucket = (int) x * 10;
			buckets[bucket].add(x);
		}
		
		//Sort individual buckets
		for (List bucket : buckets) 
		    Collections.sort(bucket); 

		//Populate the array with sorted numbers
		for(List bucket:buckets) {
			for(int i=0;i<bucket.size();i++)
				nums[numsPointer++] = (Double)bucket.get(i);
		}
		
	}
	public static void main(String[] args) {
		BucketSort object = new BucketSort();
		
		//TestCase - Input
		double[] nums = {0.9,0.98,0.4,0.45,0.3,0.2,0.1};
		System.out.println("Print Input");
		for(double x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.bucketSort(nums);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(double x:nums)
			System.out.print(x+" ");
		
	}

}
