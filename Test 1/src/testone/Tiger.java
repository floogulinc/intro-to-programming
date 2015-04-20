package testone;

public class Tiger {
	
	String name;
	int size;
	String breed;
	double age;
	
	public void roar() {
		System.out.println("ROAR");
	}
	public void run(String s, int i) {
		System.out.println("The tiger runs past a " + s + " which is " + i + " feet tall");
	}
	public String getColor() {
		return "orange";
	}
	public int pounce(int i) {
		return i;
	}

}
