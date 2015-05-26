package test2;

public class GameStarter {

	public static void main(String[] args) {
		HungerGames hg = new HungerGames();
		
		hg.setParticipants(135);
		int p = hg.getParticipants();
		double tg = hg.getToxicgas();
		
		for(tg = 0; tg < 100; tg += 5) if(tg == 50) {
				System.out.println("Half the field has been infected, no more toxic gas will be released for another day"); //Half the field has been infected, no more toxic gas will be released for another day
				break;
			}
		
		while(hg.getParticipants() > 0) {
			hg.setParticipants(hg.getParticipants() - 1);
			if(hg.getParticipants() == 1) System.out.println("You are the winner of the Hunger Games."); //You are the winner of the Hunger Games.
		}
		
	}

}
