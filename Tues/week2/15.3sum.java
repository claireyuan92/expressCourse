public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	class elem {
	    int key;
	    int val;
	}

	elem[] elems = new elem[nums.length];
	for(int i = 0; i < nums.length; i++) {
	    elems[i] = new elem(i, nums[i]);
	}
	
	
    }
}
