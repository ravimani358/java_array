package Week1.Array;

public class print_arrays_in_reverse_order {

	public static void main(String[] args) {
	
	int[] nums = new int[5];
	
	nums[0] = 4;
	nums[1] = 11;
	nums[2] = 2;
	nums[3] = 13;
	nums[4] = 5;
	
	//Print the array in reverse order
	
	for(int i = nums.length -1 ;i>=0 ; i--) {
		System.out.println("To print the array in reverse order "+nums[i]);
		}
	}
	
}
