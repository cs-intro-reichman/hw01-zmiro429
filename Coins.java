/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		int Coin = Integer.parseInt(args[0]);
		int Quarter = (Coin / 25);
		int Cent = (Coin % 25);
		System.out.println("Use " + Quarter + " quarter and " + Cent + " cents");
	}
}