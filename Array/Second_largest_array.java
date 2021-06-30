package Week1.Array;

import java.util.Arrays;

public class Second_largest_array {

	public static void main(String[] args) {

		int[] nums = new int[5];
		
		nums[0] = 12;
		nums[1] = 99;
		nums[2] = 67;
		nums[3] = 50;
		nums[4] = 77;
		
		Arrays.sort(nums);
		
		System.out.println(nums[1]);
			
	}

}
