import java.util.Random;

public class SnakeAndLadder
{
	public static void main(String args[])
	{
		System.out.println("Welcome to snake and ladder game!");
		
		int playerStartPoint = 0;
		Random rand = new Random();
		int diceRoll = (rand.nextInt(6))+1;
		
		System.out.println(diceRoll);
	}
}
		
