//DELETE AND EARN
import java.util.*;

class Solution {
    public int deleteAndEarn(int[] nums) {
        int N = nums.length;
        
        // Find the maximum element in the array
        int mx = Arrays.stream(nums).max().getAsInt();
        
        // Use a HashMap to store the sum of values for each number
        HashMap<Integer, Integer> val = new HashMap<>();
        for (int num : nums) {
            val.put(num, val.getOrDefault(num, 0) + num);
        }
        
        // Initialize variables for picking or not picking a number
        int pick = val.getOrDefault(1, 0);
        int notpick = 0;
        
        // Loop through each number from 2 to the maximum number in the array
        for (int i = 2; i <= mx; ++i) {
            int newPick = notpick + val.getOrDefault(i, 0);
            int newNotpick = Math.max(pick, notpick);
            notpick = newNotpick;
            pick = newPick;
        }
        
        // Return the maximum of picking or not picking the last element
        return Math.max(pick, notpick);
    }
}

