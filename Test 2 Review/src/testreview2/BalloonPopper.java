package testreview2;

public class BalloonPopper {

	public static void main(String[] args) {
		
		Balloon b = new Balloon();
		
		int a = b.getAir();
		double t = b.getThickness();
		
		for(a = 0; a < 100; a++) {
			if(a == 7) {
				System.out.println("the balloon popped");
				break;
			}
		}
		
		t = 20;
		while(t > 10) {
			t =- 1.5;
			if(t < 12) {
				System.out.println("the balloon popped");
				break;
			}
		}
		
	}

}
