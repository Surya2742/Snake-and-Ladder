
public class UC3 {

	public static void main(String[] args) {
		System.out.println("Starting of Snake and Ladder Game");
	    //Selection for Action after die roll
		int LADDER = 1;
		int SNAKE = 2;
		//Dice roll
		int dice = (int)((Math.random() * 6 + 1));
		//Random Action generation
		int Player_Action =(int)((Math.random() * 3));
		//start position of Player
		int playerCurrentPosition = 0;
		 switch(Player_Action)
		    {
		    case 0: 
		    	System.out.println("No Movement");
		    	break;
		    case 1: 
		    	playerCurrentPosition = LADDER;
		    	playerCurrentPosition +=dice;
		        System.out.println("Ladder move forward " + playerCurrentPosition);
		        break;
		    case 2:
		    	playerCurrentPosition =SNAKE ;
		    	playerCurrentPosition -=dice;
		    System.out.println("Snakes move backward "+ playerCurrentPosition);
		    break;
		    default :
		    	playerCurrentPosition +=dice;
		    System.out.println("Movement to " +playerCurrentPosition );
		    }
	}
}
