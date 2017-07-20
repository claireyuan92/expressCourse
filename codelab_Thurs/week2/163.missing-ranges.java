public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
	List<String> res = new ArrayList<String>();
	long l = lower;
	long r = lower;
	if(nums == null || nums.length == 0) {
	    res.add( (upper == lower) ? Integer.toString(lower): Integer.toString(lower) + "->" + Integer.toString(upper));
	    return res;
	} 
	// l is the previous tmp lower bound	
	for (int i = 0 ; i < nums.length; i++){
	    r = nums[i];
	    if (l == r) l++;
	    if(r - l > 1) {
		res.add(String.valueOf(l) + "->" + String.valueOf(r - 1));
		l = r + 1;
	    } else if (r - l  == 1) {
		res.add(String.valueOf(r - 1));
		l = r + 1;
	    }
	}
	
	if(nums[nums.length - 1] < upper) {
	    res.add( (upper - nums[nums.length - 1]) == 1 ? String.valueOf(upper): String.valueOf(nums[nums.length - 1] + 1 ) + "->" + String.valueOf(upper));
	}
	
	return res;
    }
}
