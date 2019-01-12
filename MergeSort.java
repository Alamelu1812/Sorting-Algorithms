
/*
 *  Time complexity: O(n logn)
 *  Space complexity: O (n)
 *  Stable? Yes
 */

public class MergeSort {
	
	public void mergeSort(int[] nums) {
		mergeSort(nums,0,nums.length-1);
	}
	
	public void mergeSort(int[] nums,int low,int high) {
		//Idea: Divide and Conquer
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(nums,low,mid); // call for left array
			mergeSort(nums,mid+1,high); // call for right array
			merge(nums,low,mid,high); // merge two sorted arrays
		}
	}
	
	public void merge(int[] nums,int low,int mid,int high) {
		
		//Create copies of array
		int leftCount = mid - low + 1;
		int rightCount = high - mid;
		
		int[] leftArray = new int[leftCount];
		int[] rightArray = new int[rightCount];
		
		for(int i=0;i<leftCount;i++)
			leftArray[i] = nums[i+low];
		
		for(int i=0;i<rightCount;i++)
			rightArray[i] = nums[i+mid+1];
		
		int leftPointer = 0, rightPointer = 0, resultPointer = low;
		
		//Merge two sorted arrays using sorted array approach
		while(leftPointer<leftCount && rightPointer<rightCount) {
			if(leftArray[leftPointer] <= rightArray[rightPointer])
				nums[resultPointer++] = leftArray[leftPointer++];
			else 
				nums[resultPointer++] = rightArray[rightPointer++];
		}
		
		while(leftPointer<leftCount) {
			nums[resultPointer++] = leftArray[leftPointer++];
		}
		
		while(rightPointer<rightCount) {
			nums[resultPointer++] = rightArray[rightPointer++];
		}
		
	}
	
	public static void main(String[] args) {
		MergeSort object = new MergeSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,};
		System.out.println("Print Input");
		for(int x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.mergeSort(nums);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int x:nums)
			System.out.print(x+" ");
		
	}

}
