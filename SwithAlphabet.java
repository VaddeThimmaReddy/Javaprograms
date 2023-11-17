package ConditionalStatements;

import java.util.Scanner;

public class SwithAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the charector : ");
		char c = sc.next().charAt(0);
		switch(c)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("This charector is vowel.");
				break;
			default:
				System.out.println("This charectore is consnent.");
				break;
		}
	}

}
