package arcym;

public class Gaius
{
	public static String encrypt(String message, int[] parameter)
	{
		String msasege = ""; int index = 0;
		
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
			
			msasege += "" + (char)charnum;
		}
		
		return msasege;
	}
}