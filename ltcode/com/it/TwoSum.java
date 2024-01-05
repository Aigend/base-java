package com.it;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{target-nums[i], nums[i]};
            }
            map.put(nums[i], 0);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 7,2, 9, 10};
        TwoSum twoSum = new TwoSum();
        int[] res ;
        System.out.println(twoSum.twoSum(nums, 15));
        for (int i:nums) {
            System.out.println(i);
        }
    }
}
