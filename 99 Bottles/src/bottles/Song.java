package bottles;

public class Song {
	
	//Totally done wrong, assignment was for a while loop, but this is better.
	public static void main(String[] args) {
		for(int i = 99; i > 0; i--) System.out.println(i + (i==1 ? " bottle" : " bottles") + " of pop on the wall, " + i + (i==1 ? " bottle" : " bottles") + " of pop\nYou take one down and pass it around, " + (i==1 ? "no more bottles of pop on the wall" : (i - 1) + (i==1 ? " bottle" : " bottles") + " of pop on the wall"));
	}

}
