public class Solution {
    public int findPeakElement(int[] nums) {
	if (nums.length < 2) return 0;
	if (nums[0] > nums[1]) return 0;
	if (nums[nums.length - 1] > nums[nums.length - 2] ) return nums.length - 1;
	int start = 1;
	int end = nums.length - 2;
	
	while( start + 1 < end) {
	    int mid = (start + end) >>> 1;
	    if(nums[mid] <= nums[mid + 1]) {
		start = mid;
	    }else{
		end = mid;
	    }
	}

	if (nums[start] > nums[start + 1] && nums[start] > nums[start - 1]) {
	    return start;
	}
	else {
	    return end;
	}
    }
}
