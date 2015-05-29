package ninjaturtles;

public class Turtle extends Animal {

	public int shellsize;
	
	private String name;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("The turtle eats");
	}

}
