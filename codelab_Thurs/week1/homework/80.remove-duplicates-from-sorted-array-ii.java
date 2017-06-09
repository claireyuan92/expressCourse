public class Solution {
    public int removeDuplicates(int[] nums) {
	if (nums.length < 3) {
	    return nums.length;
	}
	//pointer to record end of the non-duplicated array
	//at least 2 numbers in the result array
	int end = 1;
	//i : pointer to scan the array
	//Scan from the 3rd element
	for(int i = 2; i < nums.length; i++){
	    // is a duplicate
	    // why end - 1 ?  array sorted, so numbers should be linear order, [1,2,1] not allowed, so skip the middle one, just compare left two.
	    if(nums[i] != nums[end - 1]) {
		end++;
		nums[end] = nums[i];
	    }
	}
	return end + 1;
	
    }
}
