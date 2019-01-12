/*
 * Time Complexity: O(n^2) in worst case O(nlogn) in average case
 * Space Complexity: O(1)
 * Stable? No
 */
public class QuickSort {
	
	public void quickSort(int[] nums) {
		quickSort(nums,0,nums.length-1);
	}
	
	public void quickSort(int[] nums,int low,int high) {
		
		//Partition the array based on pivot element
		//Call the function recursively for subarrays once the position of the pivot is finalized
		if(low < high) {
			int pivot = partition(nums,low,high);
			quickSort(nums,low,pivot-1);
			quickSort(nums,pivot+1,high);
		}
	}
	
	public int partition(int[] nums, int low,int high) {
		
		//Elements from low to i are less than pivot
		//Elements from i to j are greater than pivot
		int pivot = nums[high];
		int i = low - 1;
		for(int j=low;j<high;j++) {
			if(nums[j] < pivot) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int temp = nums[++i];
		nums[i] = pivot;
		nums[high] = temp;
		return i;
	}
	
	public static void main(String[] args) {
		QuickSort object = new QuickSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,1};
		System.out.println("Print Input");
		for(int x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.quickSort(nums);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int x:nums)
			System.out.print(x+" ");
		
	}

}
