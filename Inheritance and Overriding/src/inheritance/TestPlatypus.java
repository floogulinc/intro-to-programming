package inheritance;

public class TestPlatypus {

	public static void main(String[] args) {
		//I will create 4 objects base don my inherited classes
		//and call methods to see which version of each method is called
		//I want to find out what determines which method/variable will be called
		
		Animal a = new Animal();
		Mammal m = new Mammal();		
		FreakOfNature f = new FreakOfNature();		
		Platypus p = new Platypus();
		
		a.eat(); //The Animal eats
		m.eat(); //The Mammal eats
		f.eat(); //The FreakOfNature eats
		p.eat(); //The Platypus eats
		
		a.shed(); //The Animal sheds
		m.shed(); //The Mammal sheds
		f.shed(); //The Mammal sheds
		p.shed(); //The Mammal sheds
		
		//The method that is called is determined by the object's
		//most specific (lowest on inheritance tree) method
		
		p.legs = 4;
		p.hairtype = "short hair";
		//I can assign variables in a superclass using a ref variable of the subclass
		
		Animal ap = new Platypus();
		ap.eat();
		ap.shed();
		ap.legs = 4;
		//ap.hairtype is unavailable
		
		//Platypus pa = new Animal();
		//Wont work
	}

}
