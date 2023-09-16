package com.example.demo.SomePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeDigitPairSumToZero {
//gives the target sum of linear / subsquent 2 pair sum
	public static List<List<Integer>> targetZeroSum(int[] arr) {
		Arrays.sort(arr);
		
		List<List<Integer>> validPairs=new ArrayList<>();
		for(int i=0;i<=arr.length-3;i++) {
			
			if(i==0 || arr[i]!=arr[ i-1]) {
				
				int target=0-arr[i];
				
				int left=i+1;
				int right = arr.length-1;
				while(left<right) {
					if(arr[left]+arr[right] == target) {
						List<Integer> validPair=new ArrayList<>();
						validPair.add(arr[i]);
						validPair.add(arr[left]);
						validPair.add(arr[right]);
						validPairs.add(validPair);
					 while( left < arr.length -1 && arr[left] == arr[left+1] ) left++;
					 while (right > 0  && arr[right] == arr[right-1]) right--;
					 left++;
					 right--;
					} else if (arr[left] + arr[right] <target) {
						left++;
					}else {
						right--;
					}
				}		
			}
		}
		return validPairs;
		
	}
	
	public static void main(String args[]) {
		int arr[] = new int [] {-4,-1,-1,0,1,2};
		System.out.println(targetZeroSum(arr).toString());
		
		arr = new int [] {-2,-2,-1,-1,0,0,0,2,2,2};
		System.out.println(targetZeroSum(arr).toString());
		
	}
}
