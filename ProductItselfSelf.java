package com.example.demo.SomePrograms;

import java.util.Arrays;

// product 1,2,3
/// array will be 6, 3, 2
//another approach he told to solve by multiply all .. then just divde by that number itself lol
public class ProductItselfSelf {
	public static int[] productItSelf(int[] nums) {
		int[] prefixProduct=new int [nums.length];
		prefixProduct[0] = 1;
		for(int i=1;i<nums.length;i++) {
			prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
			System.out.println(Arrays.toString(nums));
			System.out.println("i("+i+") prefixProduct[i] ("+prefixProduct[i] +" ) = prefixProduct[i-1] ("+prefixProduct[i-1] +" ) * nums[i-1]("+ nums[i-1]+")");
		}
		System.out.println("reverese iteration");
		int suffixProduct = 1;
		for(int i=nums.length-1;i>=0;i--) {
			prefixProduct[i] = prefixProduct[i] * suffixProduct;
			suffixProduct = suffixProduct * nums[i];
			System.out.println(Arrays.toString(nums));
			System.out.println("i("+i+") prefixProduct[i] ("+prefixProduct[i] +" ) = prefixProduct[i] ("+prefixProduct[i] +" ) * suffixProduct("+ suffixProduct+")");
			System.out.println("i("+i+")suffixProduct ("+suffixProduct +" ) = nums[i] ("+nums[i] +" ) * suffixProduct("+ suffixProduct+")");

		}
		return prefixProduct;
		
	}
	public static void main(String args[]) {
		int arr[] = new int [] {1,2,3,4};
		System.out.println((Arrays.toString(productItSelf(arr)) ));
		}
	}

