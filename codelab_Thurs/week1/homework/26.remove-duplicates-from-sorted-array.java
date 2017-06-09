public class Solution {
    public int removeDuplicates(int[] nums) {
	if (nums.length < 2) {
	    return nums.length;
	}
	//pointer to record end of the non-duplicated arrary
	int end = 0;

	for(int i = 1; i < nums.length; i++) {
	    if(nums[i] != nums[end]) {
		end++;
		nums[end] = nums[i];
	    }
	}
	return end + 1;
    }
}
