package arcym;

import java.util.Scanner;

public class Initate
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int[] parameter = {3};
		
		System.out.print("MESSAGE :: ");
		String message = keyboard.nextLine().toUpperCase();
		
		System.out.print("Your encrypted message is .. ");
		System.out.println(Gaius.encrypt(message,parameter));
	}
}