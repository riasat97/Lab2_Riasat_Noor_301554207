package com.rn.lesson3.rollingdice;

import java.security.SecureRandom;

public class RollingDice {

	private static final SecureRandom random = new SecureRandom();

	

	public static void main(String[] args) {
		System.out.println("=== Starting Four-Dice Game ===");

		int d1 = random.nextInt(6) + 1;
		int d2 = random.nextInt(6) + 1;
		int d3 = random.nextInt(6) + 1;
		int d4 = random.nextInt(6) + 1;
		int sum = d1 + d2 + d3 + d4;

		System.out.println("Rolled Sum = " + sum);

		if (sum == 7 || sum == 11 || sum == 15 || sum == 21) {
			System.out.println("You WIN!");
		} else if (sum == 10 || sum == 12 || sum == 19 || sum == 20 || sum == 22 || sum == 23 || sum == 24 || sum == 13) {
			System.out.println("You LOSE!");
		} 
		else {
			int goal = sum;
			System.out.println("\nYour GOAL number is: " + goal);

			while (true) {
				int di1 = random.nextInt(6) + 1;
				int di2 = random.nextInt(6) + 1;
				int di3 = random.nextInt(6) + 1;
				int di4 = random.nextInt(6) + 1;
				int sumagin = di1 + di2 + di3 + di4;

				System.out.println("Rolled Sum = " + sum);
				int nextRoll = sumagin;

				if (nextRoll == goal) {
					System.out.println("Result: Hit Goal, You WIN!");
					break;
				} else {
					System.out.println(" Rolling again...\n");
				}
			}
		}
	}
}
