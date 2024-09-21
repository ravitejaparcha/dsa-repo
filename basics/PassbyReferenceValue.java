package com.dsa.basics;

/*
 * Reference URL: https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1
 * 
 * Geek is learning about functions and calling a function with arguments. He learns that passing can take one of two forms: pass by value or pass by reference.
 * Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.
 * 
 * Example 1:
 * 
 * Input:
 * a = 1
 * b = 2
 * 
 * Output:
 * 2 4
 * 
 * Explanation: 1 was passed by value whereas 2 passed by reference.
 * 
 * Example 2:
 * 
 * Input:
 * a = 10
 * b = 20
 * 
 * Output: 11 22
 * 
 * Explanation: 10 was passed by value whereas 20 passed by reference.
 * 
 * 
 * Constraints:
 * 1 <= a,b <= 105
 * 
 *  
 **/


import java.util.Scanner;

public class PassbyReferenceValue {

	static int[] passedBy(int a, int b) {

		if((a>=1 && a<=100000) && (b>=1 && b<=100000)){
			a = a + 1;
			b = b + 2;

		}
		int[] arr = {a,b};
		return arr;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int res[] = passedBy(a, b);
		
		System.out.println(res[0] + " " + res[1]);
		
		scanner.close();
	}

}
