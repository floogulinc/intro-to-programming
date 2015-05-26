package privatevariables;

public class Ogre {
	
	//Constructors

	public Ogre(int i) {
		setAge(i);
	}
	
	public Ogre() {
		this(3);
	}
	
	
	//Code from Private Practice project

	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}