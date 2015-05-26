package testreview;

public class TestCat {

	public static void main(String[] args) {
		Cat b = new Cat();
		
		b.name = "Rufio";
		b.size = 1.3;
		b.age = 14;
		
		b.meow(); //Meow, meow
		b.run("thing", 2); //The cat runs past a thing which is 2 feet tall
		
		System.out.println("The cat jumps " + b.jump() + " times " //The cat jumps 4 times 
				+ "\nThe cat makes a " + b.purr("purr") + " sound when it purrs"); //The cat makes a purr sound when it purrs
		
		boolean c = true;
		if(c == false)
			System.out.println("Rufio is a good cat");
		else
			System.out.println("Rufio is dumb"); //Rufio is dumb
		
	}

}
