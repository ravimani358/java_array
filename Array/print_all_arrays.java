package Week1.Array;

public class print_all_arrays {

	public static void main(String[] args) {
		//Print the array in reverse order
		
		
		int[] nums = new int[5];
		
		nums[0] = 4;
		nums[1] = 11;
		nums[2] = 2;
		nums[3] = 13;
		nums[4] = 5;
				
		for(int i =0; i<nums.length; i++) {
			System.out.println("To print the array in reverse order "+nums[i]);
		}
		
	}

}
