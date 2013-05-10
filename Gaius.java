public class Gaius
{
	public static String encrypt(String givenMessage, int[] givenParameters)
	{
		return crypt(givenMessage.toUpperCase(), givenParameters);
	}
	
	public static String decrypt(String givenMessage, int[] givenParameters)
	{
		for(int i = 0; i < givenParameters.length; i++)
		{givenParameters[i] = givenParameters[i] * -1;}
		
		return crypt(givenMessage.toUpperCase(), givenParameters);
	}
	
	private static String crypt(String givenMessage, int[] givenParameters)
	{
		String processedMessage = ""; int currentParameters = 0;
		for(int aee = 0; aee < givenMessage.length(); aee++)
		{
			int characterValue = givenMessage.charAt(aee);
			if(characterValue == ' ') {characterValue = '#';}
			else if(Character.isLetter(characterValue))
			{
				characterValue += givenParameters[currentParameters];
				if(characterValue > 90) {characterValue = 64 + characterValue - 90;}
				if(characterValue < 65) {characterValue = 91 + characterValue - 65;}
				if(++currentParameters >= givenParameters.length) {currentParameters = 0;}
			}
			
			processedMessage += Character.toString((char)characterValue);
		}
		
		return processedMessage;
	}
}