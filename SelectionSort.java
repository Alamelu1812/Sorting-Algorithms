
/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Stable? No
 */
public class SelectionSort {
	
	public void selectionSort(int[] nums) {
		
		for(int i=0;i<nums.length-1;i++) {
			//For each position, find the minimum from the unsorted array
			//All elements in position lesser than i are sorted
			int minIndex = i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[minIndex] > nums[j])
					minIndex = j;
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		SelectionSort object = new SelectionSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,1};
		System.out.println("Print Input");
		for(int x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.selectionSort(nums);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int x:nums)
			System.out.print(x+" ");
		
	}

}
