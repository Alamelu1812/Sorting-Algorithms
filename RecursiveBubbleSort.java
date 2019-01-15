
/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(n) - Stack Space
 * Stable? Yes
 */

public class RecursiveBubbleSort {
	
	public void recursiveBubbleSort(int[] nums,int length) {
		
		//If there is only one element return
		if(length == 0)
			return ;
		
		//Parse through unsorted array, swap elements
		//End of the loop, the largest element is moved to the end
		for(int i=0;i<length;i++) {
			if(nums[i] > nums[i+1]) {
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
			}
		}
		
		//Call function for length -1 unsorted elements
		recursiveBubbleSort(nums,length-1);
	}
	
	public static void main(String[] args) {
		RecursiveBubbleSort object = new RecursiveBubbleSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,1};
		System.out.println("Print Input");
		for(int x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.recursiveBubbleSort(nums,nums.length-1);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int x:nums)
			System.out.print(x+" ");
		
	}

}
