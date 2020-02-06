import java.security.SecureRandom;

public class Plaeyer {
	
	SecureRandom random = new SecureRandom();
	
	public int guessNumber ()
	{
		int random1 = random.nextInt(10);
		return random1;
	}

}
