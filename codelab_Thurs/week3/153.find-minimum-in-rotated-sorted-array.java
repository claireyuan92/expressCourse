public class Solution {
    public int findMin(int[] nums) {
	int start = 0;
	int end = nums.length - 1;
	while (start + 1 < end) {
	    int mid = (start + end) >>> 1;
	    // ending condition
	    if (nums[start] < nums[end]) {
		return nums[start];
	    }

	    if (nums[start] < nums[mid]) {
		start = mid;
	    } else {
		end = mid;
	    }
	}

	if (nums[start] < nums[end]) {
	    return nums[start];
	}else {
	    return nums[end];
	}
    }
}
