package ConditionalStatements;

import java.util.Scanner;

public class FruitsStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a code based on a value? Apple is One, Banana is Two, Mango is Three and or else print Four.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit name : ");
		String x = sc.nextLine();
		if (x.equals("Apple"))
		{
			System.out.println("One");
		}
		else if (x.equals("Banana"))
		{
			System.out.println("Two");
		}
		else if (x.equals("Orange"))
		{
			System.out.println("Three");
		}
		else
		{
			System.out.println("Four");
		}

	}
}