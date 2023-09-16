package com.example.demo.SomePrograms;

import java.util.Arrays;


//GIVES TOTAL SUM OF THE subsequent array..

// - 1,2,4,-2
// here max sum 6  and 2+4
public class MaximumSubArray {
	public static int maximumSubArray(int[] nums) {
		int curr=nums[0];
		int max =nums[0];
		for(int i=1;i<nums.length;i++) {
			curr = Math.max(nums[i], nums[i]+curr);
			max  = Math.max(max, curr);
		}
		
		return max;
		
	}

	public static void main(String args[]) {
		int arr[] = new int [] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println((maximumSubArray(arr)));
		}
	}
