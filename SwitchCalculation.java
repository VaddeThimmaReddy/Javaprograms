package ConditionalStatements;

import java.util.Scanner;

public class SwitchCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the calculation type : ");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case '+':
		{
			System.out.println("Enter two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int z = a+b;
			System.out.println("The addition of two numbers is : "+z);
			break;
		}
		case '-':
		{
			System.out.println("Enter two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int z = a-b;
			System.out.println("The Subtraction of two numbers is : "+z);
			break;
		}
		case '*':
		{
			System.out.println("Enter two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int z = a*b;
			System.out.println("The Multiplication of two numbers is : "+z);
			break;
		}
		case '/':
		{
			System.out.println("Enter two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int z = a/b;
			System.out.println("The Division of two numbers is : "+z);
			break;
		}
		default:
		{
			System.out.println("Please enter the correct calculation type :");
		}
		}
	}

}
