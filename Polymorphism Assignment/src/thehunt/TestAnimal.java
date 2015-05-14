package thehunt;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Canine c = new Canine();
		Wolf w = new Wolf();
		
		a.roam(); //The animal roams aimlessly
		w.roam(6); //6 wolves run in the pack
		w.roam(); //The lone wolf looks for his pack
		a.roam(); //The animal roams aimlessly
		c.makeNoise(); //Bark Bark
		w.makeNoise(); //Howl
		c.makeNoise(3); //Bow, Wow 3 times
		
	}

}
