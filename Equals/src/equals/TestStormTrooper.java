//Paul Friederichsen

package equals;

public class TestStormTrooper {

	public static void main(String[] args) {
		
		StormTrooper a = new StormTrooper();
		StormTrooper b = new StormTrooper();
		
		a.color = "white";
		b.color = "white";
		
		a.danceScore = 10;
		b.danceScore = 10;
		
		System.out.println("danceScore is " + ((a.danceScore == b.danceScore) ? "equal" : "not equal")); //danceScore is equal
		System.out.println("color is " + ((a.color.equals(b.color)) ? "equal" : "not equal")); //color is equal
		System.out.println("a and b reference variables are " + ((a == b) ? "equal" : "not equal")); //a and b reference variables are not equal
		System.out.println("a and b objects are " + ((a.equals(b)) ? "equal" : "not equal")); //a and b objects are not equal
		
		StormTrooper c = b;
		System.out.println("c and b reference variables are " + ((c == b) ? "equal" : "not equal")); //c and b reference variables are equal
		System.out.println("c and b objects are " + ((c.equals(b)) ? "equal" : "not equal")); //c and b objects are equal
		
	}

}
