package returnpractice;

public class CallReturningStuff {
	
	public static void main(String[] args) {
		
		ReturningStuff test = new ReturningStuff();
		
		String a1 = test.returnString();
		int a2 = test.returnInt();
		double a3 = test.returnDouble(5.11);
		char a4 = test.returnChar();
		
		System.out.println(a1); //Paul Friederichsen
		System.out.println(a2); //17
		System.out.println(a3); //5.11
		System.out.println(a4); //w
		
		if(test.returnBool() == true) {
			System.out.println("bool is true"); //bool is true
		} else {
			System.out.println("bool is false");
		}
	}

}
