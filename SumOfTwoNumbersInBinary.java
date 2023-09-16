package com.example.demo.SomePrograms;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoNumbersInBinary {

	public static int sumOfTwoBinary(int a,int b) {
		int ans=0;
		int carry=0;
		while(b!=0) {
			carry= a & b;
			a = a ^ b;
			b = carry<<1;
		}
		return a;
	}
	public static void main(String args[]) {
		
		System.out.println((sumOfTwoBinary(-2,5)));
		System.out.println((sumOfTwoBinary(-5,-5)));
		}
	}

