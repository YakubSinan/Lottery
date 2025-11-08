package lottery;

import java.util.Random;
import java.util.Scanner;

public class lottery {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		// Create lucky numbers array and fill it with 6 random numbers in [1,49].
		int[] luckyNumbers = new int[6];
		for (int i = 0; i < luckyNumbers.length; i++)
			luckyNumbers[i] = rnd.nextInt(49) + 1;

		// Print lucky numbers using printArray() method.
		printArray(luckyNumbers);

		// Get 6 user inputs and store them in userInput array.
		int[] userInput = new int[6];
		for (int i = 0; i < userInput.length; i++) {
			System.out.println("Enter number " + (i + 1) + ": ");
			userInput[i] = scan.nextInt();
		}

		// For each of the user inputs, search for lucky numbers and find winners.
		int counter = 0;
		for (int j = 0; j < userInput.length; j++) {
			for (int i = 0; i < luckyNumbers.length; i++) {
				if (userInput[j] == luckyNumbers[i])
					counter++;
			}
		}
		System.out.println(counter + " number(s) win! ");
	}

	// A method definition to print an integer array's members.
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();



	}

}
