package Hash;

import java.util.HashMap;
import java.util.Map;

public class No532KdiffPairsinanArray {

//	Set<Map.Entry<K,V>>	entrySet()
//	Returns a Set view of the mappings contained in this map.
	
	public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
