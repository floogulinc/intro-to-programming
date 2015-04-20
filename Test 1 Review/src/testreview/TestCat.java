package testreview;

public class TestCat {

	public static void main(String[] args) {
		Cat b = new Cat();
		
		b.name = "Rufio";
		b.size = 1.3;
		b.age = 14;
		
		b.meow();
		b.run("thing", 2);
		
		System.out.println("The cat jumps " + b.jump() + " times "
				+ "\nThe cat makes a " + b.purr("purr") + " sound when it purrs");
		
		boolean c = true;
		if(c == false)
			System.out.println("Rufio is a good cat");
		else
			System.out.println("Rufio is dumb");
		
	}

}
