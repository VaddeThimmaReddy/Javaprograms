package ConditionalStatements;

import java.util.Scanner;

public class ClothShope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cloths cloths = new Cloths();
		cloths.getTotalCost("Shirt", 10);

	}

}
class Cloths
{
	public void getTotalCost(String cn , int qty)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cloth name : ");
		String cname = sc.nextLine();
		System.out.println("Enter the quantity : ");
		int qt = sc.nextInt();
		if (cname.equals("Shirt") && qt>=10)
		{
			int tc = qt*400;
			System.out.println(tc);
		}
		else if (cname.equals("Shirt") && qt<10)
		{
			int tc = qt*500;
			System.out.println(tc);
		}
		else if (cname.equals("Jeans") && qt>=20)
		{
			int tc = qt*600;
			System.out.println(tc);
		}
		else if (cname.equals("Jeans") && qt<12)
		{
			int tc = qt*750;
			System.out.println(tc);
		}else if (cname.equals("T-shirt") && qt>=15)
		{
			int tc = qt*350;
			System.out.println(tc);
		}else if (cname.equals("T-shirt") && qt<=9)
		{
			int tc = qt*450;
			System.out.println(tc);
		}else if (cname.equals("Pant") && qt>=40)
		{
			int tc = qt*620;
			System.out.println(tc);
		}
		else
		{
			System.out.println("Out of stack");
		}
	}
}