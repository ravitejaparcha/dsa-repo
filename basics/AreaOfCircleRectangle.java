package com.dsa.basics;

/*
 * Reference URL: https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1
 * 
 * Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
 * If the user's choice is 1, calculate the area of the circle having the given radius(R).  
 * Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).
 * 
 * Note : A list arr[], containing the single value R or the two values L and B, as input parameters. 
 * Return the area of the desired geometrical figure. Use Math.PI for the value of pi.
 * 
 * Examples :
 * Input: choice = 1, R = 5
 * Output: 78.53981633974483
 * Explanation: The choice is 1. So we have to calculate the area of the circle.
 * 
 * Input: choice = 2, L = 5, B = 10
 * Output: 50
 * Explanation: Here we have to calculate the area of the rectangle.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AreaOfCircleRectangle {
	
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the choice 1 or 2:");

		int choice = scanner.nextInt();

		List<Double> list = new ArrayList<>();
		double area = 0;


		switch (choice ) {
		case 1:
			System.out.println("Enter the radius: ");
			double r = scanner.nextDouble();
			list.add(r);
			area = switchCase(choice, list);
			System.out.println(area);
			break;
		case 2:
			System.out.println("Enter the length: ");
			double L = scanner.nextDouble();
			list.add(L);
			System.out.println("Enter the breadth: ");
			double B = scanner.nextDouble();
			list.add(B);
			area = switchCase(choice, list);
			System.out.println(area);
			break;
		default:
			System.out.println("Invalid input");
			break;

		}
		scanner.close();

	}

	static double switchCase(int choice, List<Double> arr){


		double area = 0;

		switch (choice) {
		case 1: 
			double r = arr.get(0);
			area = Math.PI * r * r;
			break;
		case 2:
			double l = arr.get(0);
			double b = arr.get(1);
			area = l*b;
			break;
		default: 
			System.out.println("Invalid data");
			break;
		}

		return area;

	}

}
