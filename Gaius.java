public class Gaius
{
	public static String encrypt(String givenMessage, int[] givenParameters)
	{
		return crypt(givenMessage, givenParameters);
	}
	
	public static String decrypt(String givenMessage, int[] givenParameters)
	{
		for(int i = 0; i < givenParameters.length; i++)
		{givenParameters[i] = givenParameters[i] * -1;}
		return crypt(givenMessage, givenParameters);
	}
	
	private static String crypt(String givenMessage, int[] givenParameters)
	{
		givenMessage = givenMessage.toUpperCase();
		
		int currentParameter = 0;
		String processedMessage = new String();
		for(int i = 0; i < givenMessage.length(); i++)
		{
			int characterValue = givenMessage.charAt(i);
			if(characterValue == ' ') {characterValue = '#';}
			else if(Character.isLetter(characterValue))
			{
				characterValue += givenParameters[currentParameter];
				if(characterValue > 90) {characterValue = 64 + characterValue - 90;}
				if(characterValue < 65) {characterValue = 91 + characterValue - 65;}
				if(++currentParameter >= givenParameter.length) {currentParameter = 0;}
			}
			
			processedMessage += Character.toString((char)characterValue);
		}
		
		return processedMessage;
	}
}