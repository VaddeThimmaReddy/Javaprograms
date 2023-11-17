package ConditionalStatements;

import java.util.Scanner;

public class FruitShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fruits = new Fruits();
		int totalCost = fruits.getTotalCost("Aple", 2);
		System.out.println("The total cost is : "+totalCost);		
				

	}

}
class Fruits
{
	
	public int getTotalCost(String fn , int qty)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit name : ");
		String f = sc.nextLine();
		System.out.println("Enter the quantity : ");
		int t = sc.nextInt();
		if (f.equals("Apple") && t<10)
		{
			int tc = t*15;
			return tc;
		}
		else if (f.equals("Apple") && (t>=10 && t<=20))
		{
			int tc = t*13;
			return tc;
		}
		else if (f.equals("Apple") && t>20)
		{
			int tc =t*12;
			return tc;
		}
		else if (f.equals("Orange") && t<20)
		{
			int tc = t*8;
			return tc;
		}
		else if (f.equals("Orange") && (t==20 || t>20))
		{
			int tc = t*7;
			return tc;
		}
		else if (f.equals("Banana") && t<100)
		{
			int tc = t*3;
			return tc;
		}
		else if (f.equals("Banana") && (t==100 || t>100))
		{
			int tc = t*2;
			return tc;
		}
		else
		{
			return 0;
		}
	}
}