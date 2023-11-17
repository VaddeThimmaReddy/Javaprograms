package ConditionalStatements;

import java.util.Scanner;

public class ThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find the biggest of tree numbers?
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter any three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a==b && a==c && b==c)
		{
			System.out.println("Given tree numbers are equal.");
		}
		else if(a>b && a>c)
		{
			System.out.println("a is bigger :"+a);
		}
		
		else if(a==b && a>c)
		{
			System.out.println("a and b both are equal and bigger : ");
		}
		else if(a==c && a>b)
		{
			System.out.println("a and c both are equal and bigger : ");
		}
		else if(b==c && b>a)
		{
			System.out.println("b and c both are equal and bigger : ");
		}
		else if (b>c)
		{
			System.out.println("b is bigger : "+b);
		}
		else
		{
			System.out.println("c is bigger : "+c);
		}
	}

}
