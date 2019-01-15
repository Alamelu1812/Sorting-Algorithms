
/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Stable? Yes
 */

public class RecursiveInsertionSort {
	
	public void recursiveInsertionSort(int[] nums,int length) {
		
		//Base Condition
		if(length <= 0)
			return;
		
		recursiveInsertionSort(nums,length-1);
		
		//Last element
		int element = nums[length];
		int j =length-1;
		//Shift elements of sorted array until the right position is found
		while(j>=0 && nums[j] > element) {
			nums[j+1] = nums[j];
			j--;
		}
		nums[j+1] = element;
	}
	
	public static void main(String[] args) {
		RecursiveInsertionSort object = new RecursiveInsertionSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,1};
		System.out.println("Print Input");
		for(int x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.recursiveInsertionSort(nums,nums.length-1);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int x:nums)
			System.out.print(x+" ");
		
	}

}
