package LineComparison;

import java.util.Scanner;

public class LineCompDemoBlz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("WelCome To Line Comparison Program");

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the point x1");

		int x1 = s.nextInt();

		System.out.println("Enter the point x2");

		int x2 = s.nextInt();

		System.out.println("Enter the point y1");

		int y1 = s.nextInt();

		System.out.println("Enter the point y2");

		int y2 = s.nextInt();

		double length = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));

		System.err.println("Length of line is= " + length);
	}

}