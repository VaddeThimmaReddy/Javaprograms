package ConditionalStatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDay days = new WeekDay();
		days.getDayName(2);

	}

}
class WeekDay
{
	public void getDayName(int number)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the day number : ");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednessday");
			break;
		case 5: 
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Enter the correct day number :");
		}
	}
}