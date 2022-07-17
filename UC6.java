
public class UC6 {

	public static void main(String[] args) {   
		System.out.println("Starting of Snake and Ladder Game");			
	int LADDER = 1;
	int SNAKE = 2;
	int Die_Count = 0;
	int playerCurrentPosition = 0;
			
			while( playerCurrentPosition< 100) 
			{
				Die_Count++;
			int dice = (int)((Math.random()*6) + 1 );
			System.out.println("Dice number is:" +dice);   
		    int position = (int)(Math.random() * 3 );
		    if(position == LADDER)
		    {	
		    	playerCurrentPosition += dice;
		    if(playerCurrentPosition > 100)
		    {
		    	playerCurrentPosition -= dice;
		    }
		    System.out.println("Ladder moves the Player forward at position : "+ playerCurrentPosition);
		    }
		    else if(position == SNAKE)
		    {	
		    	playerCurrentPosition -= dice;
		    if(playerCurrentPosition < 0)
		    {
		    	playerCurrentPosition = 0;
		    }
		    System.out.println("Snake moves the Player backward at position : "+ playerCurrentPosition);
		    }
		    else
		    {
		    System.out.println("Player is at position : "+ playerCurrentPosition);
		    }
		    
	}
			System.out.println("Die has been rolled for " + Die_Count + " times.");
}
	
}
