package privatevariables;

public class TestTolkien {

	public static void main(String[] args) {
		
		Hobbit h = new Hobbit();		
		System.out.println("The Hobbit is " + h.getSize() + " size"); //The Hobbit is 3.0 size
		
		Hobbit h1 = new Hobbit(2);
		System.out.println("The Hobbit is " + h1.getSize() + " size"); //The Hobbit is 2.0 size
		
		
		Ogre o = new Ogre();
		System.out.println("The Ogre is " + o.getAge() + " years old"); //The Ogre is 3 years old
		
		Ogre o1 = new Ogre(2);
		System.out.println("The Ogre is " + o1.getAge() + " years old"); //The Ogre is 2 years old
		
	}

}
