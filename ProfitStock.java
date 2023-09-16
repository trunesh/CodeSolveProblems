package com.example.demo.SomePrograms;

import java.util.Arrays;

public class ProfitStock {
	public static int getProfit(int[] stocks) {
		if(stocks.length==1) return 1;
		int profit=0;
		int left = 0;
		
		for(int right=1;right<stocks.length;right++){
			if(stocks[right] > stocks[left]) {
				profit = Math.max(profit, stocks[right]-stocks[left]);
			}else {
				left = right;
			}
		}
		return profit;
	}

	public static void main(String args[]) {
		//prints the max profit i.e. 6-1 = 5 .. so we have to select 6 and 1
		int arr[] = new int [] {7,1,5,3,6,4};
		System.out.println((getProfit(arr)));
		}
	}
