package com.example.demo.SomePrograms;

import java.util.HashSet;
import java.util.Set;

public class findMaxContainWatter {

	public static int findMaxWater(int[] nums) {
		int ans=0;
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int minimum = Math.min(nums[left], nums[right]);
			int distance= Math.abs( left-right);
			ans = Math.max(ans, distance*minimum);
			
			if(nums[left]>nums[right]) {
				right--;
			}else {
				left++;
			}
		}
		
		return ans;
	}
	public static void main(String args[]) {
		int arr[] = new int [] {1,4,3,7,2}; //ans 8
		System.out.println((findMaxWater(arr)));
		
		int arrs[] = new int [] {1,8,6,2,5,4,8,3,7};
		System.out.println((findMaxWater(arrs)));
		}
	}

