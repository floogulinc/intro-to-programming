package testreview2;

public class BalloonPopper {

	public static void main(String[] args) {
		
		Balloon b = new Balloon();
		
		int a = b.getAir();
		double t = b.getThickness();
		
		for(int i = 0; i < 100; i++) {
			b.setAir(i);
			if(a == 7) {
				System.out.println("the balloon popped");
				break;
			}
		}
		
		b.setThickness(20);
		while(t > 10) {
			b.setThickness(t - 1.5);
			if(t < 12) {
				System.out.println("the balloon popped");
				break;
			}
		}
		
	}

}
