package ConditionalStatements;

import java.util.Scanner;

public class MarriageEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender : ");
		String gender = sc.nextLine();
		System.out.println("Enter the gender age : ");
		int age = sc.nextInt();
		
		if(age>=21 && gender.equals("Male"))
		{
			System.out.println("This person is eligible for marriage");
		}
		else if(age>=21 && gender.equals("Female"))
		{
			System.out.println("This person is eligible for marriage");
		}
		else
		{
			System.out.println("This person is not eligible for marriage");
		}

	}

}
