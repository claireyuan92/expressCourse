public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap();
        for(int i = 0; i < nums.length ; i++) {
            int pivot = target - nums[i];
            if(indices.containsKey(pivot) ){
                return new int[] {indices.get(pivot), i};
            }
            indices.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
}