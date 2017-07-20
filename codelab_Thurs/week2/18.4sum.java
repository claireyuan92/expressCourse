public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
	List<List<Integer>>  res = new ArrayList<>();
	Arrays.sort(nums);
	for(int i = 0; i < nums.length; i ++) {
	    if (i > 0 && nums[i] == nums[i - 1]) {
		continue;
	    }
	    
	    for(int j = i + 1; j < nums.length; j ++) {
		if(j > i + 1  && nums[j] == nums[j - 1]) {
		    continue;
		}
		int twoSum = nums[i] + nums[j];
		int left = j + 1;
		int right = nums.length - 1;
		
		while(left < right) {
		    int sum = nums[left] + nums[right];
		    if ( sum < target - twoSum) {
			left++;
		    } else if (sum > target - twoSum) {
			right--;
		    } else {
			List<Integer> set = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
			res.add(set);
			int leftVal = nums[left];
			int rightVal = nums[right];
			while(left < right && nums[left] == leftVal){
			    left++;
			}
			while(left < right && nums[right] == rightVal) {
			    right--;
			}
							  
		    }
		}
	    }
	}
	return res;
    }
}
