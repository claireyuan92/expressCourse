public class Solution {
    
    // Sort and one pass with two pointers
    public int[] twoSum(int[] nums, int target) {
	int[] sorted = new int[nums.length];
	System.arraycopy(nums, 0, sorted, 0, nums.length);
	Arrays.sort(sorted);
	int i = 0;
	int j = nums.length - 1;
	int v1, v2;
	while( i < j) {
	    int sum = sorted[i] + sorted[j];
	    if( sum == target) {
		break;
	    } else if (sum < target) {
		i++;
	    } else {
		j--;
	    }
	}
	
	int ind1 = -1;
	int ind2 = -1;
	for(int k = 0 ;k < nums.length; k++) {
	    if(sorted[i] == nums[k] || sorted[j] == nums[k]) {
		if( ind1 == -1) {
		    ind1 = k;
		} else {
		    ind2 = k;
		}
	    }
	}

	int[] res = {ind1, ind2};
	Arrays.sort(res);
	return res;

    }

}
