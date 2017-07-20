public class Solution {
    public int maxArea(int[] height) {
	//http://bangbingsyb.blogspot.com/2014/11/leetcode-container-with-most-water.html
	/*Solution:
	  left = 0, right = n - 1
	  1. height[left] < height[right], left++
	  2. height[left] > height[right],right--
	  3. height[left] = hegith[right], left++, right--
	  stop case: left>= right

	  key points:
	     1. keep a globalMax
	     2. curMax = min(heigth[left], height[right]) * (right - left)	     
	 */

	int res = 0;
	int left = 0, right = height.length - 1;
	while(left < right) {
	    int curMax = Math.min(height[left], height[right]) * (right - left);
	    res = Math.max(res, curMax);
	    if(height[left] < height[right]) {
		left++;
	    } else if (height[left] > height[right]) {
		right--;
	    } else {
		left++;
		right--;
	    }
	}

	return res;
    }
}
