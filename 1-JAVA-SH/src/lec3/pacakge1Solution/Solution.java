package lec3.pacakge1Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(numMap.containsKey(complement)){
                int[] ans=new int[] {numMap.get(complement),i};
                //System.out.println(ans);
                //java prints the memory address instead of printing the array
                System.out.println(Arrays.toString(ans));
                return ans;
            }
            numMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
