package com.dsa.basics;

import java.util.Scanner;


public class OutputDataTypeSize {

	/* Reference URL: https://www.geeksforgeeks.org/problems/data-type-1666706751/1
	 *   * 
	 * Geek is learning a new programming language. As data type forms the most fundamental part of a language, Geek is learning them with focus and needs your help.
	 * Given a data type, help Geek in finding the size of it in byte.
	 * Data Type - Character, Integer, Long, Float and Double
	 * 
	 * Example: 1
	 * Input: Character
	 * Output: 1
	 * 
	 * Example: 2
	 * Input: Integer
	 * Output: 4
	 */

	public static void main(String[] args) {

		// Take the input from console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Data Type: ");
		String s = scanner.nextLine();	

		// Call the function and store the return result in size parameter.
		int size = dataTypeSize(s);	

		// Validate the return result from the method
		if (size == -1)
			System.out.println("Invalid data type");
		else
			System.out.println("Entered data type is " + s + " and it's size is " + size);

		// Close the scanner close for memory efficiency
		scanner.close();
	}

	static int dataTypeSize(String str) {


		if (str.equals("Character")){			
			return Character.BYTES;
		}
		else if(str.equals("Integer")){			
			return Integer.BYTES;
		}

		else if(str.equals("Long")){
			return Long.BYTES;
		}

		else if(str.equals("Float")){
			return Float.BYTES;
		}

		else if(str.equals("Double")){
			return Double.BYTES;
		}
		else {
			return -1;
		}

	}


}
