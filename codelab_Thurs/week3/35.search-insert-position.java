public class Solution {
    public int searchInsert(int[] nums, int target) {
	int start = 0;
	int end = nums.length - 1;
	
	if (nums.length < 1 || nums[0] >= target) {
	    return 0;
	}
	
	if (nums[nums.length - 1] < target) {
	    return nums.length;
	}
	
	while(start + 1 < end) {
	    int mid = (start + end) >>> 1;
	    if (nums[mid] >= target) {
		end = mid;
		} else {
		start = mid;
	    }
	}
	
	if (target <= nums[start]) {
	    return start;
	} else {
	    return end;
	}
    }
    
}
