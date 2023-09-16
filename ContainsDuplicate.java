package com.example.demo.SomePrograms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static Boolean isDuplicateExist(int[] nums) {
		Set<Integer> uniqueNumber=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(uniqueNumber.contains(nums[i])) {
				return true;
			}else{
				uniqueNumber.add(nums[i]);
			}	
		}
		return false;
	}
	public static void main(String args[]) {
		int arr[] = new int [] {7,1,5,3,6,4};
		System.out.println((isDuplicateExist(arr)));
		}
	}

