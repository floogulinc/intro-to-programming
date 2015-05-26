package primitiveMath;

import java.util.ArrayList;

public class PrimitivePractice {

	public static void main(String[] args) {
		// I am going to declare some primitive variables
		
		char a = 'j'; //this is essentially a one character string
		boolean bool = true; // this will be used primarily in if then statments
		byte b = 2; // 1 byte
		short c = 200; // 2 bytes
		int d = 2000; // 4 bytes
		long e = 1234567890; // 8 bytes
		float f = 12.2f; //gotta put an f in here, use double most of the time, 4 bytes
		double g = 20.20; // 8 bytes

		long f1 = d; //Widening Casting(Implicit)
		int d1 = (int) f; //Narrowing Casting(Explicitly done)
		
		short c1 = b;
		int d2 = c;
		double g1 = f;
		
		long result = d + c;
		System.out.println(result); //2200
		
		int a1 = 150 + 50;
		int a2 = d / b;
		float a3 = f / b;
		
		System.out.println(a1 + " " + a2 + " " + a3); //200 1000 6.1
		
		double a4 = g* c;
		double a5 = f * d;
		float a6 = f - d;
		int a7 = c + b;
		double a8 = e / g;
		
		System.out.println(a4 + " " + a5 + " " + a6 + " " + a7 + " " + a8); //4040.0 24400.0 -1987.8 202 6.111722227722772E7
		
		if(d == 2000) {
			System.out.println("d is equal to 2000"); //d is equal to 2000
		} else {
			System.out.println("d is not equla to 2000");
		}
		
		if(b < 10) {
			System.out.println("b is pretty small"); //b is pretty small
		}
		
		if(g < 20.20) {
			System.out.println("g is small");
		} else if (g == 20.20) {
			System.out.println("g is 20.20"); //g is 20.20
		} else {
			System.out.println("g is large");
		}
		
		if(f <= 10) {
			System.out.println("f is 10 or less");
		} else if(f > 10) {
			System.out.println("f is larger than 10"); //f is larger than 10
		} else {
			System.out.println("f isn't a number");
		}
		
		
		
	}

}
