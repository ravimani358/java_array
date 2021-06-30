package Week1.Array;

import java.util.Arrays;

public class Array_shortdata_in_ascending_order {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		nums[0] = 12;
		nums[1] = 24;
		nums[2] = 10;
		nums[3] = 19;
		nums[4] = 100;
		
		Arrays.sort(nums);
		
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
