package inheritanceassignment;

public class PlayerMain 
{
	public static void main(String[] args) 
	{
		Player player=new Player();
		System.out.println(player);
		
		HockyPlayer hockyplayer=new HockyPlayer();
		hockyplayer.showHockyPlayer();
		
		Cricketer cricketer=new Cricketer();
		cricketer.showCricketer();
		
		FootBallPlayer footBallPlayer=new FootBallPlayer();
		footBallPlayer.showFootBallPlayer();
		
		Batsman batsman=new Batsman();
		batsman.showBatsman();
		
		Bowler bowler=new Bowler();
		bowler.showBowler();
	}

}
