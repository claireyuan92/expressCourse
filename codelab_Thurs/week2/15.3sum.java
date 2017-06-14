public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	int[] sorted = new int[nums.length];
	System.arraycopy(nums, 0, sorted , 0,  nums.length);
	Arrays.sort(sorted);
	List<List<Integer>> res = new LinkedList<>();
	for(int i = 0 ; i < sorted.length ; i++) {
	    // remove duplicate for pointer 1
	    if (i > 0 && sorted[i] == sorted[i - 1]) {
		continue;
	    }
	    int target  = -sorted[i];
	    //left is scanning throught array, do not need to consider index before i
	    int left = i + 1;
	    int right = sorted.length - 1;

	    while(left < right) {
		if(sorted[left] + sorted[right] < target) {
		    left++;
		} else if(sorted[left] + sorted[right] > target){
		    right--;
		} else {
		    List<Integer> set = Arrays.asList(sorted[i], sorted[left], sorted[right]);
		    res.add(set);
		    int leftVal = sorted[left];
		    //remove duplicate for pointer 2
		    while(left < right && sorted[left] == leftVal ) {
			left++;
		    }
		    int rightVal = sorted[right];
		    //remove duplicate for pointer 3
		    while(right > left && sorted[right] == rightVal ) {
			right--;
		    }
		}
	    }
	    
	}
	return res;
    }
}
