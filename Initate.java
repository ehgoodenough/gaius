package arcym;

import java.util.Scanner;

public class Initate
{
	private static Scanner keyboard = new Scanner(System.in);
	private static int[] parameter = {3};
	
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("Welcome to GaiusEncryption!");
			System.out.println("Please select an option:");
			System.out.println("[1] Encrypt a message");
			System.out.println("[2] Decrypt a message");
			System.out.print("OPTION#");
			
			int option = keyboard.nextLine().charAt(0) - 48;
			
			System.out.println("");
			
			if(option == 1) {initiateEncrypt();}
			else if(option == 2) {initiateDecrypt();}
		}
	}
	
	private static void initiateEncrypt()
	{
		System.out.print("Type the message you want to encrypt: ");
		String message = keyboard.nextLine().toUpperCase();
		System.out.print("Your encrypted message is ");
		System.out.println(Gaius.encrypt(message,parameter));
		System.out.println("");
	}
	
	private static void initiateDecrypt()
	{
		System.out.print("Type the message you want to decrypt: ");
		String message = keyboard.nextLine().toUpperCase();
		System.out.print("Your decrypted message is ");
		System.out.println(Gaius.decrypt(message,parameter));
		System.out.println("");
	}
}