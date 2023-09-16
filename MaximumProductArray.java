package com.example.demo.SomePrograms;

import java.util.Arrays;



public class MaximumProductArray {
	public static int MaximumProductArray(int[] nums) {
		int ans = nums[0];
		int max=1;
		int min=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				min = 1;
				max = 1;
				ans = Math.max(ans,nums[i]);
				continue;
			}
			int tmp = min;
			min = Math.min(nums[i], Math.min( nums[i]*min ,nums[i]*max));
			max = Math.max(nums[i], Math.max(nums[i]*tmp,nums[i]*max) );
			ans = Math.max(ans, max);
		}
 		return ans;
		
	}

	public static void main(String args[]) {
		int arr[] = new int [] {-1,-2,-3,0,3,5,-1,-2};
		System.out.println((MaximumProductArray(arr)));
		}
	}
