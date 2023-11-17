package ConditionalStatements;

import java.util.Scanner;

public class NoOfUnits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of units : ");
		int a = sc.nextInt();
		if(a<=100)
		{
			System.out.println("Zero");
		}
		else if(a<=300)
		{
			int b = (a-100)*2;
			System.out.println("The total amount is : "+b);
		}
		else if(a<=500)
		{
			int b = (200*2)+(a-300)*5;
			System.out.println("The total amount is : "+b);
		}
		else
		{
			System.out.println("Enter the correct number of units.");
		}

	}

}
