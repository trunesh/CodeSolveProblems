package com.example.demo.SomePrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoDigitPairTargetSum {
//gives the target sum of linear / subsquent 2 pair sum
	public static int[] targetPairSum(int[] arr, int target) {
		int [] ans = new int[2];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int diff = target-arr[i];
			if(!map.containsKey(diff)) {
				map.put(arr[i], i);
			}else {
				ans[0] = i;
				ans [1] = map.get(diff);
 			}
		}
		return ans;
		
	}
	
	public static void main(String args[]) {
		int arr[] = new int [] {2,7,11,15};
		int target=9;
		System.out.println(Arrays.toString(targetPairSum(arr,target)) );
		
	}
}
