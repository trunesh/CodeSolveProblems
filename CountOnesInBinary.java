package com.example.demo.SomePrograms;

import java.util.HashSet;
import java.util.Set;

public class CountOnesInBinary {

	public static int CountOnesInIntegerNumber(int a) {
		int mask=1;
		int count=0;
		
		
	    while(mask<=a) {
	    	//System.out.println("a " + a + " mask "+ mask);
			int ans=mask&a;
	    	//.out.println("ans "+ ans);

			if(ans!=0) {
				count++;
			}
			mask=mask<<1;
		}
		return count;
		
	}
	public static void main(String args[]) {
		System.out.println((CountOnesInIntegerNumber(2)));
		System.out.println((CountOnesInIntegerNumber(32)));
		}
	}

