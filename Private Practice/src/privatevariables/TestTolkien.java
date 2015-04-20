package privatevariables;

public class TestTolkien {

	public static void main(String[] args) {
		Ogre o = new Ogre();
		
		o.setAge(50);
		System.out.println("The Ogre is " + o.getAge() + " years old");
		
		o.setSize(15);
		System.out.println("The Ogre is " + o.getSize() + " size");
		
		o.setSize(60);
		System.out.println("The Ogre is " + o.getSize() + " size");
		
	}

}
