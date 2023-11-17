package ConditionalStatements;

import java.util.Scanner;

public class DivisableNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int a = sc.nextInt();
		if(a%3==0 && a%5==0)
		{
			System.out.println("The given number is divisable by 3 and 5. ");
		}
		else if(a%3==0)
		{
			System.out.println("The given number is only divisable by 3. ");
		}
		else if(a%5==0)
		{
			System.out.println("The given number is only divisable by 5. ");
		}
		else
		{
			System.out.println("Enter the correct number. ");
		}

	}

}
