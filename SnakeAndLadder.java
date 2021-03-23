import java.util.Random;

public class SnakeAndLadder
{
	public static void main(String args[])
	{	
		// adding welcome note
		System.out.println("Welcome to snake and ladder game!");
		
		// giving a start point to player
		int playerStartPoint = 0;

		int playerPosition = 0, playerPreviousPoint = 0, diceCount = 0;
		
		// while loop for fetching result
		while(playerPosition <= 100){

			// generating random number for dice to roll 1-6
      	Random rand = new Random();
      	int diceRoll = (rand.nextInt(6))+1;
			diceCount = diceCount + 1;

      	// generating random numbers for play 0-2
      	Random ran = new Random();
      	int playCheck = ran.nextInt(3);

			playerPreviousPoint = playerPosition;

			// writing a swtich case for play check  
			switch (playCheck) {
				case 0:
					playerPosition = playerPosition;
					//System.out.println("Sorry no luck! You can't play.");
					break;

				case 1:
					playerPosition = diceRoll + playerPosition;
					//System.out.println("Hurray you got ladder! You are moved by " + diceRoll + " positions.");
					break;
			
				case 2:
					playerPosition = playerPosition - diceRoll;
					//System.out.println("Hissss ! You are bitten by snake");
					break;
			
				default:
					System.out.println("Invalid Option");

			}
			// player position each time dice is rolled
			System.out.println("Player position after dice roll " + playerPosition);
								
			if (playerPosition < 0){
				playerPosition = playerStartPoint;
			}else if (playerPosition > 100){
				playerPosition = playerPosition - playerPreviousPoint;
			}else if (playerPosition == 100){
				break;
			}
		}
		// printing dice count
		System.out.println("No.of Times dice has been rolled: " + diceCount);

		// end result
		System.out.println("Player wins!, Game Over.");
	}	

}
		
