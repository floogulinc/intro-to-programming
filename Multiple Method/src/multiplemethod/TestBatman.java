package multiplemethod;

public class TestBatman {
	
	public static void main(String[] args) {
		Batman batman = new Batman();
		
		batman.puttosleep(3, 12); //It takes 3 blades to put a villain to sleep for 12 hours
		batman.overfeed(3, "Dr Fishy", 1.5); //Batman accidentally fed hsi fish named Dr Fishy 3 sacks of grain, which only gave him 1.5 hours to live
		
		Joker joker = new Joker();
		
		String place = "St. Louis Park";
		
		joker.applylipstick(5, "L'Oréal"); //The Joker applies his lipstick for 5 mintues with his favorite brand, L'Oréal
		joker.revealPlan(3, place, 3.5); //I will destroy the hospital in 3 days. The hospital in St. Louis Park in 3.5 hours
		
		batman.stopbomb(30, place, 1, 2000); //Batman stopped the bomb at St. Louis Park in 30.0 minutes 1.0 hours before it exploded, saving 2000 lives.
	}

}
