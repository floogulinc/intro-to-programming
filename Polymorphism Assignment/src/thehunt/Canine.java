package thehunt;

public class Canine extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("Bark Bark");
	}
	
	public void makeNoise(int i) {
		System.out.println("Bow, Wow " + i + " times");
	}
	
}
