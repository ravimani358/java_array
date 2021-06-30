package Week1.Array;

import java.util.Arrays;

public class Array_in_descending_order {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		nums[0] = 17;
		nums[1] = 16;
		nums[2] = 19;
		nums[3] = 25;
		nums[4] = 20;
		
		Arrays.sort(nums);
		
		for(int i =nums.length-1; i>=0; i--) {
			System.out.println(nums[i]);
		}
		
	}

}
