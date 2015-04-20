package multiplemethod;

public class TestBatman {
	
	public static void main(String[] args) {
		Batman batman = new Batman();
		
		batman.puttosleep(3, 12);
		batman.overfeed(3, "Dr Fishy", 1.5);
		
		Joker joker = new Joker();
		
		String place = "St. Louis Park";
		
		joker.applylipstick(5, "L'Oréal");
		joker.revealPlan(3, place, 3.5);
		
		batman.stopbomb(30, place, 1, 2000);
	}

}
