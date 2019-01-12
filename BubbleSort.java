
/*
 * Time Complexity: O(n^2)
 * Space Complexity: O (1)
 * Stable? Yes
 */
public class BubbleSort {
	
	public void bubbleSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			
			//The last i items would be sorted by now
			for(int j=0;j<nums.length-i-1;j++) {
				
				//Swapping elements if they are out of order
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BubbleSort object = new BubbleSort();
		
		//TestCase - Input
		int[] nums = {9,8,4,5,3,2,};
		System.out.println("Print Input");
		for(int x:nums)
			System.out.print(x+" ");
		
		//Calling sort
		object.bubbleSort(nums);
		System.out.println();
		
		//TestCase - Output
		System.out.println("Print Output");
		for(int x:nums)
			System.out.print(x+" ");
		
	}

}
