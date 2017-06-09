public class Solution {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> hashmap = new HashMap<>();
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(
			new Comparator<Map.Entry<Integer, Integer>>() {
				public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
					return e1.getValue() - e2.getValue();
				}
			});
	//Initializing hashmap
		for(int i = 0; i < nums.length; i++) {
			if(hashmap.containsKey(nums[i])) {
				hashmap.put(nums[i], hashmap.get(nums[i]) + 1);
			}else {
				hashmap.put(nums[i], 1);
			}
		}

	//keep a queue of size k
		for(Map.Entry<Integer,Integer> entry: hashmap.entrySet()) {
			if(pq.size() < k) {
				pq.offer(entry);
			} else if(pq.peek().getValue() < entry.getValue()) {
				pq.poll();
				pq.offer(entry);
			}
		}

		List<Integer> ans = new ArrayList<Integer>();

		for(Map.Entry<Integer, Integer> entry: pq) {
			ans.add(entry.getKey());
		}

		return ans;
		
	}
}
