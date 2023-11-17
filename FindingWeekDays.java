package ConditionalStatements;

import java.util.Scanner;

public class FindingWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDays days = new WeekDays();
		
		System.out.println(days.getday(5));

	}

}
class WeekDays
{
	public String getday(int daynumber)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week number : ");
		int x = sc.nextInt();
		if (x == 1)
		{
			return "sunday";
		}
		else if (x == 2)
		{
			return "monday";
		}
		else if (x == 3)
		{
			return "tuesday";
		}
		else if (x == 4)
		{
			return "wednesday";
		}
		else if (x == 5)
		{
			return "thursday";
		}
		else if (x == 6)
		{
			return "friday";
		}
		else if (x == 7)
		{
			return "saturday";
		}
		return "Default number";
	}
}