package ConditionalStatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To write a code with the help of conditional statements.
		//Print data based on x value? 10 is Hii ,14 is Hello ,20 is Bye,or print Welcome
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the any Number : ");
		int x = Sc.nextInt();
		if(x==10)
		{
			System.out.println("Hii");
		}
		else if(x==14)
		{
			System.out.println("Hello");
		}
		else if(x==20)
		{
			System.out.println("Bye");
		}
		else
		{
			System.out.println("Welcome");
		}

	}

}
