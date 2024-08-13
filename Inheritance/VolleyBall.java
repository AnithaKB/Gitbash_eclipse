package Inheritance;

public class VolleyBall extends Ball {

	int noOfPlayers;
	
	VolleyBall(int noOfPlayers, int radius){
		super(radius);
		this.noOfPlayers=noOfPlayers;
	}

}
