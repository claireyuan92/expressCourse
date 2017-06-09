public class Solution {
    public void sortColors(int[] nums) {
	if (nums.length < 2) return;
	int p_0 = 0;
	int p_2 = nums.length - 1;

	for(int i = 0; i <=p_2 ; i++) {

	    if(nums[i] == 0) {
		swap(nums, i, p_0);
		p_0++;
	    }else if(nums[i] == 2) {
		swap(nums, i, p_2);
		p_2--;
		i--;
	    }
	    
	}
    }
	private void swap(int[] a, int i, int j) {
	    int tmp = a[i];
	    a[i] = a[j];
	    a[j] = tmp;
	}
	

}
