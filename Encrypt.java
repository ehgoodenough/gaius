import java.util.Random;
import java.util.Scanner;

public class Encrypt
{
	private static Scanner keyboard = new Scanner(System.in);
	private static Random randomness = new Random(8432052);
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to GaiusEncryption!");
		
		while(true)
		{
			System.out.println("Please select an option:");
			System.out.println("[1] Encrypt a message");
			System.out.println("[2] Decrypt a message");
			System.out.println("[3] Exit the program");
			System.out.print(">>> ");
			
			int option = keyboard.nextLine().charAt(0) - 48;
			
			System.out.println("");
			
			switch(option)
			{
			case 1: initiateEncryption(); break;
			case 2: initiateDecryption(); break;
			case 3: System.exit(0); break;
			default: break;
			}
		}
	}
	
	private static void initiateEncryption()
	{
		System.out.print("Type the message you want to encrypt: ");
		String message = keyboard.nextLine();
		int[] parameter = {randomness.nextInt(24)};
		System.out.print("Your encrypted message is ");
		System.out.print(Gaius.encrypt(message,parameter));
		System.out.print(" with parameters of " + parameter[0]);
		System.out.println("."); System.out.println();
	}
	
	private static void initiateDecryption()
	{
		System.out.print("Type the message you want to decrypt: ");
		String message = keyboard.nextLine();
		int[] parameter = {randomness.nextInt(24)};
		System.out.print("Your decrypted message is ");
		System.out.println(Gaius.decrypt(message,parameter));
		System.out.print(" with parameters of " + parameter[0]);
		System.out.println("."); System.out.println();
	}
}