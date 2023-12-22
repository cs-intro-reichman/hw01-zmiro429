/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */
public class Triangle {
	public static void main(String[] args) {
		int S1 = Integer.parseInt(args[0]);
		int S2 = Integer.parseInt(args[1]);
		int S3 = Integer.parseInt(args[2]);
		boolean Answer = Test(S1, S2, S3);
		System.out.println(+S1 + ", " + S2 + ", " + S3 + ": " + Answer);

	}

	public static boolean Test(int S1, int S2, int S3) {
		if ((S1 + S2) < S3)
			return false;
		if ((S1 + S3) < S2)
			return false;
		if ((S2 + S3) < S1)
			return false;
		return true;
	}
}
