
public class UC7 {
	
	public static void main(String[] args) {   
		System.out.println("Starting of Snake and Ladder Game");	
	int Player1_Position = 0;
	int Player2_Position = 0;
	int LADDER = 1;
	int SNAKE = 2;
	int Die_Count = 0;
			
			while( Player1_Position < 100 && Player2_Position < 100) 
			{
				Die_Count++;
			int dice1 = (int)((Math.random()*6) + 1 );
			System.out.println("Player1 current Position is : " + Player1_Position);
			int dice2 = (int)((Math.random()*6) + 1 );
			System.out.println("Player2 current position is : " + Player2_Position);
			
		    int position = (int)(Math.random() * 3 );
		    if(position == LADDER)
		    {	
		    	Player1_Position += dice1;
		    	Player2_Position += dice2;
		    if(Player1_Position > 100 || Player2_Position > 100)
		    {
		    	Player1_Position -= dice1;
		    	Player2_Position -= dice2;
		    }
		    System.out.println("Ladder moves the Player1 forward at position : "+ Player1_Position);
		    System.out.println("Ladder moves the Player2 forward at position : "+ Player2_Position);
		    }
		    else if(position == SNAKE)
		    {	
		    	Player1_Position -= dice1;
		    	Player2_Position -= dice2;
		    if(Player1_Position < 0 || Player2_Position < 0)
		    {
		    	Player1_Position = 0;
		    	Player2_Position = 0;
		    }
		    System.out.println("Snake moves the Player1 backward at position : "+ Player1_Position);
		    System.out.println("Snake moves the Player2 backward at position : "+ Player2_Position);
		    }
		    else
		    {
		    System.out.println("Player1 is at position : "+ Player1_Position);
		    System.out.println("Player2 is at position : "+ Player2_Position);
		    }
		    
	}
			System.out.println("Die has been rolled for " + Die_Count + " times.");
			  if(Player1_Position == 100)
			    	System.out.println("Player1 Wins");	
			    else  if(Player2_Position == 100)
			    	System.out.println("Player2 Win");
}
	
}
