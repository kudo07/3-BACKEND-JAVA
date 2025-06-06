package lec2;

import java.util.HashMap;
import java.util.Map;
class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> numMap=new HashMap<>();
            int n=nums.length;
            for(int i=0;i<n;i++){
                int complement=target-nums[i];
                if(numMap.containsKey(complement)){
                    return new int[] {numMap.get(complement),i};
                }
                numMap.put(nums[i],i);
            }
            return new int[]{};

    }
}

public class Addtwo{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,2,3,3};
        sol.twoSum(arr,3);

    }
}
