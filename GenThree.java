/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		// Put your code here
		int Min = Integer.parseInt(args[0]);
		int Max = Integer.parseInt(args[1]);
		Random Gen = new Random((Max - Min) + Min);
		int randommin = (Gen.nextInt(Max - Min) + Min);
		System.out.println(randommin);
		int randomvalue;
		// for loop for printing the two ramining 2 random numbers
		for (int i = 0; i < 2; i++) {
			randomvalue = (Gen.nextInt(Max - Min) + Min);
			System.out.println(randomvalue);
			if (randommin > randomvalue)
				randommin = randomvalue;
		}
		System.out.println("The minimal genrated number was " + randommin);
	}
}
