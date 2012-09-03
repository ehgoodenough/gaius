package arcym;

public class encrypt
{
	public static void main(String[] args)
	{
		String message = "Simplicity is the prerequisite for reliability";
		
		for(int aee = 0; aee < message.length(); aee++)
		{
			int charnum = message.charAt(aee);
			System.out.print((char)charnum);
		}
	}
}