
public class UC4 {
	
	public static void main(String[] args) {   
		System.out.println("Starting of Snake and Ladder Game");			
	int LADDER = 1;
	int SNAKE = 2;
	int playerCurrentPosition = 0;
			
			while( playerCurrentPosition< 100) 
			{
			int dice = (int)((Math.random()*6) + 1 );
			System.out.println("Dice number is:" +dice);   
		    int position  = (int)(Math.random() * 3 );
		    if(position == LADDER)
		    {	
		    	playerCurrentPosition += dice;
		    System.out.println("Ladder moves forward "+ playerCurrentPosition);
		    }
		    else if(position == SNAKE)
		    {	
		    	playerCurrentPosition -= dice;
		    if(playerCurrentPosition < 0)
		    {
		    	playerCurrentPosition = 0;
		    }
		    System.out.println("Snake moves backward "+ playerCurrentPosition);
		    }
		    else
		    {
		    System.out.println("Player is on "+ playerCurrentPosition);
		    }
		    
	}
}
}
