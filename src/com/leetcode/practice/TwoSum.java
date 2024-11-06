package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {

	public int[] twoSumWithMap(int[] nums, int target) {

		Map<Integer, Integer> numberIndex = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i]; // If c = a+b, then b = c-a;
			if (numberIndex.containsKey(complement)) {
				return new int[] { numberIndex.get(complement), i };
			}

			// Pushing each number and indices in a map
			numberIndex.put(nums[i], i);

		}
		
		//Return null if no complement is found
		return null;
	}
	
	public int[] twoSumWithNestedFor(int[] nums, int target) {
		int[] indices = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				int num = nums[i];
				if (num + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
					break;
				}
			}
		}
		return indices;
	}
}
