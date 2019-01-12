
/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Stable? Yes
 */
public class InsertionSort {
	
	public void insertionSort(int[] nums) {
		//Insert each element into its correct position in a sorted array
		for(int i=0;i<nums.length;i++) {
			int element = nums[i];
			int j =i-1;
			//Shift elements of sorted array until the right position is found
			while(j>=0 && nums[j] > element) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = element;
		}
	}
	
	public static void main(String[] args) {
		InsertionSort object = new InsertionSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,1};
		System.out.println("Print Input");
		for(int x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.insertionSort(nums);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int x:nums)
			System.out.print(x+" ");
		
	}

}
