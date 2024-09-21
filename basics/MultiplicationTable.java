package com.dsa.basics;

/*
 * Reference URL: https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1
 * 
 * While loop is another loop like for loop but unlike for loop it only checks for one condition.
 * Here, we will use a while loop and print a number n's table in reverse order.
 * 
 * Note : As the code is checked against multiple test cases, don't forget to add a new line as it is necessary after every execution.
 * 
 * Example 1:
 * Input:1
 * 
 * Output:
 * 10 9 8 7 6 5 4 3 2 1
 * 
 * Example 2:
 * Input:
 * 2
 * 
 * Output:
 * 20 18 16 14 12 10 8 6 4 2
 * 
 */

public class MultiplicationTable {
	
	 static void printTable (int n) 
	 {
	    if(n>=1 && n<=1000){
           int multiplier=10;
           while(multiplier>0)
           {
               System.out.print(n*multiplier + " ");
               multiplier--;
               
           }
      System.out.println();
	    }
	 }

	public static void main(String[] args) {
		
		printTable(2);

	}
	
}
