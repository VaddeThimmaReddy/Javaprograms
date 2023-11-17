package ConditionalStatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the year : ");
		int a = sc.nextInt();
		System.out.println("Enter the month : ");
		int b = sc.nextInt();
		System.out.println("Enter the day : ");
		int c = sc.nextInt();
		System.out.println("Enter the year : ");
		int d = sc.nextInt();
		System.out.println("Enter the month : ");
		int e = sc.nextInt();
		System.out.println("Enter the day : ");
		int f = sc.nextInt();
		int jan = 31;
		int feb;
		int mar = 31;
		int apr = 30;
		int may = 31;
		int jun = 30;
		int jul = 31;
		int aug = 31;
		int sep = 30;
		int oct = 31;
		int nov = 30;
		int des = 31;
		if(a%4==0 && a%100==0 && a%400==0)
		{
			feb = 29;
		}
		else if(a%4==0 && a%100!=0)
		{
			feb = 29;
		}
		else
		{
			feb = 28;
		}

	}

}
