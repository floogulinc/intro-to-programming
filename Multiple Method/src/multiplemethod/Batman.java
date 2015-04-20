package multiplemethod;

public class Batman {
	
	public void puttosleep(int blades, int hours) {
		System.out.println("It takes " + blades + " blades to put a villain to sleep for " + hours + " hours");
	}
	
	public void overfeed (int food, String fish, double life) {
		System.out.println("Batman accidentally fed hsi fish named " + fish + " " + food + " sacks of grain, which only gave him " + life + " hours to live");
	}
	
	public void stopbomb (double mt, String p, double hb, int ls) {
		System.out.println("Batman stopped the bomb at " + p + " in " + mt + " minutes " + hb + " hours before it exploded, saving " + ls + " lives.");
	}

}
