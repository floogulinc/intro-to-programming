//Paul Friederichsen

package castingdemo;

public class CastingTest {
	
	public static void castingdemo(String[] args) {
		int x = 15;
		double y = (double) x;
		
		short a = 25;
		long b = (long) a;
		
		long q = 4002;
		short c = (short) q;
		
		float f = 82.8364f;
		long g = (long) f;	
	}
	
	//assignment
	public static void main(String[] args) {
		int x = 15;
		short x1 = (short) x;
		byte x2 = (byte) x;
		long x3 = (long) x;
		double x4 = (double) x; //would print 15.0
		
		String s = "250";
		short s2 = Short.parseShort(s);
		double s3 = (double) s2;
	}

}
