public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	int[] sorted = new int[nums.length];
	System.arraycopy(nums, 0, sorted, 0, nums.length);
	Array.sort(sorted);
	List<Integer> set = new LinkedList();
	List<List<Integer>> res = new LinkedList();
	for(int i = 0 ; i < nums.length; i++) {
	    if( i!= 0 &&  sorted[i - 1] == sorted[i]) {
		continue;
	    }
	    int 2SumTarget = -sorted[i];
	    int left = i + 1;
	    int right = nums.length - 1;

	    while(left < right) {
		if ()
	    }
		
	    
 	}
	
    }
}
