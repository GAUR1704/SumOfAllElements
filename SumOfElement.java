package com.LoopProject;

public class SumOfElement {

	public static void main(String[] args) {
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i : my_array)
			
			sum += i;
		
		System.out.println("The Sum of All numbers is " + sum);

	}

}
000000000000000