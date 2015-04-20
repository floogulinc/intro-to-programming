package testreview;

public class Cat {
	
	public String name;
	public double size;
	public int age;
	
	public void meow() {
		System.out.println("Meow, meow");
	}
	public void run (String x, int y) {
		System.out.println("The cat runs past a " + x + " which is " + y + " feet tall");
	}
	public int jump() {
		return 4;
	}
	public String purr(String s) {
		return s;
	}

}
