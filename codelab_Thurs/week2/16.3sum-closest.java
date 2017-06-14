public class Solution {
    public int threeSumClosest(int[] nums, int target) {
	Arrays.sort(nums);
	int res = -1;
	int min_distance = Integer.MAX_VALUE;	
	for(int i = 0; i < nums.length ; i++) {
	    int left = i + 1;
	    int right = nums.length -1;
	    while(left < right ) {
		int sum =nums[i] + nums[left] + nums[right];
		int current_distance  = Math.abs(target - sum);
		if (current_distance < min_distance ) {
		    min_distance = current_distance;
		    res =sum;
		 
		}
		if(sum  < target) {
		    left++;
		} else {
		    right--;
		}
	    }
	}
	return res;
    }
}
