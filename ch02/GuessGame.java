import java.security.SecureRandom;

public class GuessGame {
	SecureRandom randomNumberGuess = new  SecureRandom ();
	Plaeyer p1 = new Plaeyer();
	Plaeyer p2 = new Plaeyer();
	Plaeyer p3 = new Plaeyer();

	public void startGame()
	{
		// three variable hold 3 guesses player makes
		int guessP1 = 0;
		int guessP2 = 0;
		int guessP3 = 0;

		
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
				
		int targetNumber = randomNumberGuess.nextInt(10);
		System.out.println ("i'm thinking of a number between 0 and 9 ... ");
		
		while (true)
		{
			System.out.println("Number to guess is "+ targetNumber);
			guessP1 = p1.guessNumber();
			System.out.println("Player 1 guessed  "+ guessP1);
			guessP2 = p2.guessNumber();
			System.out.println("Player 2 guessed  "+ guessP2);
			guessP3 = p3.guessNumber();
			System.out.println("Player 3 guessed  "+ guessP3);
			
			if (guessP1 == targetNumber)
			{
				p1IsRight = true;
			}
			if (guessP2 == targetNumber)
			{
				p2IsRight = true;
			}
			if (guessP3 == targetNumber)
			{
				p3IsRight = true;
			}
			
			if (p1IsRight || p2IsRight || p3IsRight) {
				
				System.out.println("We have awinner");
				System.out.println("player 1 gots it right ? " + p1IsRight);
				System.out.println("player 2 gots it right ? " + p2IsRight);
				System.out.println("player 3 gots it right ? " + p3IsRight);
				System.out.println("Game is over ");
				break;
			}
			else
			
			{
				System.out.println ("Player will try a gain ");
			}
			
			
		}
		
	}
	
}
