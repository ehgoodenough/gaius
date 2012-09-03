package arcym;

public class encrypt
{
	public static void main(String[] args)
	{
		int index = 0;
		int[] parameter = {3, 7, 11};
		String message = "Simplicity is the prerequisite for reliability".toUpperCase();
		
		for(int aee = 0; aee < message.length(); aee++)
		{
			int charnum = message.charAt(aee);
			
			if(charnum == ' ') {charnum = '#';}
			
			else
			{
				charnum += parameter[index];
				
				if(charnum > 90) {charnum = 64 + charnum - 90;}
				
				if(++index >= parameter.length) {index = 0;}
			}
			
			System.out.print((char)charnum);
		}
	}
}