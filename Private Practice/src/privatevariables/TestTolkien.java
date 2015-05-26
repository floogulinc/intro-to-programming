package privatevariables;

public class TestTolkien {

	public static void main(String[] args) {
		Ogre o = new Ogre();
		
		o.setAge(50);
		System.out.println("The Ogre is " + o.getAge() + " years old"); //The Ogre is 50 years old
		
		o.setSize(15); //Size cannot be smaller than 20, size has been set to 25.0
		System.out.println("The Ogre is " + o.getSize() + " size"); //The Ogre is 25.0 size
		
		o.setSize(60);
		System.out.println("The Ogre is " + o.getSize() + " size"); //The Ogre is 60.0 size
		
	}

}
