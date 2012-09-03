package arcym;

public class encrypt
{
	public static void main(String[] args)
	{
		int parameter = 3;
		String message = "Simplicity is the prerequisite for reliability".toUpperCase();
		
		for(int aee = 0; aee < message.length(); aee++)
		{
			int charnum = message.charAt(aee);
			
			if(charnum == ' ') {charnum = '#';}
			
			else
			{
				charnum += parameter;
				
				if(charnum > 90) {charnum = 64 + charnum - 90;}
			}
			
			System.out.print((char)charnum);
		}
	}
}