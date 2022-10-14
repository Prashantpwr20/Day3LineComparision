package LineComparison;

import java.util.Scanner;

public class LineCompUc3Blz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("WelCome To Line Comparison Computation Program");
		System.out.println();

		System.out.println("Enter The Length1 of line");
		
		System.out.println();

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the point x1");

		int x1 = s.nextInt();

		System.out.println("Enter the point x2");

		int x2 = s.nextInt();

		System.out.println("Enter the point y1");

		int y1 = s.nextInt();

		System.out.println("Enter the point y2");

		int y2 = s.nextInt();

		double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));

		System.err.println("Length of line1 is= " + length1);

		System.out.println();

		System.out.println("Enter The Second Length of line");

		System.out.println("Enter the point m1");

		int m1 = s.nextInt();

		System.out.println("Enter the point m2");

		int m2 = s.nextInt();

		System.out.println("Enter the point n1");

		int n1 = s.nextInt();

		System.out.println("Enter the point n2");

		int n2 = s.nextInt();

		double length2 = Math.sqrt(Math.pow((m2 - m1), 2) + (Math.pow((n2 - n1), 2)));
		
		System.out.println();
		
		System.out.println();

		System.err.println("Length of line2 is= " + length2);

		if (length1 == length2) {

			System.out.println("The Length of Line is Equal");

		} else if (length1 > length2) {

			System.err.println("The Length First line Is greater Than Length of Second Line");

		} else {

			System.err.println("The Length First line is less  Than Length of Second Line");
		}
	}

}
