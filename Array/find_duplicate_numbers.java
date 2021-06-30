package Week1.Array;

//import java.util.Arrays;

public class find_duplicate_numbers {

	public static void main(String[] args) {
		
		int[] nums = {1,22,33,22};
		
		//==================================================
		for(int i=0; i<nums.length; i++) {
			
			for(int j = i+1; j<nums.length; j++) {
				
				if(nums[i] == nums[j]) {
					System.out.println("Duplicated Array elements "+nums[i]);
				}
			}
			
		}
		
		//========================================================
		

	}

}
