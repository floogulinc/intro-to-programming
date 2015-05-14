package thehunt;

public class Wolf extends Canine {
	
	@Override
	public void makeNoise() {
		System.out.println("Howl");
	}
	
	@Override
	public void roam() {
		System.out.println("The lone wolf looks for his pack");
	}
	
	public void roam(int i) {
		System.out.println(i + " wolves run in the pack");
	}
	
}
