
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Stable? No
 */

public class CountingSort {
	
	public int[] countingSort(int[] nums) {
		//Depending on the range of elements, create a counts array
		int[] countsArray = new int[10];
		
		//Extra space to hold the sorted array
		int[] outputArray = new int[nums.length];
		
		//Initialize all counts to 0
		for(int i=0;i<nums.length;i++)
			countsArray[i] = 0; 
		
		//Count the occurrence of each element using its index
		for(int i=0;i<nums.length;i++)
			countsArray[nums[i]]++;
		
		//A cummulative count of number of elements below it is stored
		//This count is an indicator of where the index of the element in the sorted array
		for(int i=1;i<countsArray.length;i++)
			countsArray[i] += countsArray[i-1];
		
		//Place elements in appropriate position
		for(int i=nums.length-1;i>=0;i--) {
			outputArray[countsArray[nums[i]]-1] = nums[i];
			countsArray[nums[i]]--;
		}
		
		//Return output array
		return outputArray;
	}
	
	
	public static void main(String[] args) {
		CountingSort object = new CountingSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,0};
		System.out.println("Print Input");

		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		
		//Calling sort
		nums = object.countingSort(nums);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		
	}
}
