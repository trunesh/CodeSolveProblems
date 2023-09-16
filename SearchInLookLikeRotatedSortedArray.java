package com.example.demo.SomePrograms;

import java.util.HashMap;



public class SearchInLookLikeRotatedSortedArray {
	public static String printAns(int position,int search) {
		return "Search element " + search + " found at position index : " + position;
		
	}
	public static String SearchInLookLikeRotatedSortedArray(int[] nums,int target) {
		int left= 0;
		int right = nums.length -1;
		while(left<=right) {
			int mid = left + (right-left) / 2;
			if(nums[mid]==target) {
				return printAns(mid,target);
			}
			if(nums[left]<=nums[mid]) {
				if(nums[left] <= target && target < nums[mid] ) {
					right = mid -1;
				}else {
					left = mid +1;
				}
			}else {
				if(nums[mid] <  target && target <= nums[right] ) {
					left  = mid  + 1;
				}else {
					right  = mid - 1;
				}
			}
		}
		return printAns(-1,-1);
		
	}

	public static void main(String args[]) {
		int arr[] = new int [] {6,7,0,1,2,3,4};
		System.out.println((SearchInLookLikeRotatedSortedArray(arr,1)));
		}
	}
