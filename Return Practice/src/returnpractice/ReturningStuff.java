package returnpractice;

public class ReturningStuff {
	
	public String returnString() {
		String a = "Paul Friederichsen";
		return a;
	}
	public int returnInt() {
		return 17;
	}
	public double returnDouble(double h) {
		return h;
	}
	public char returnChar() {
		return 'w';
	}
	public char returnChartest(String a, int place) {
		return a.charAt(place);
	}

	public boolean returnBool() {
		return true;
	}
}
