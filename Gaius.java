public class Gaius
{
	public static String encrypt(String givenMessage, int[] givenParameters)
	{
		return crypt(givenMessage.toUpperCase(), givenParameters);
	}
	
	public static String decrypt(String givenMessage, int[] givenParameters)
	{
		int[] inversedParameters = givenParameters;
		for(int oee = 0; oee < inversedParameters.length; oee++)
		{inversedParameters[oee] = inversedParameters[oee] * -1;}
		return crypt(givenMessage.toUpperCase(), inversedParameters);
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