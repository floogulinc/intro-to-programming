package arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		
		/*int[] intarray1 = {4,12,5,10,0};
		System.out.println(intarray[2]);*/
		
		int[] intarray2 = new int[5];
		intarray2[0] = 4;
		intarray2[1] = 12;
		intarray2[2] = 5;
		intarray2[3] = 10;
		//System.out.println(intarray2[2]);
		for(int item : intarray2) System.out.println(item);
		
		double[] doublearray = {5.0,6.0,7.0,8.0,9.0,10.0};
		for(double item : doublearray) System.out.println(item);
		
		//create an array that will print the line "this is a string array" when it is run through an enhanced for loop
		String[] stringarray1 = {"this", "is", "a", "string", "array"};
		for(String item : stringarray1) System.out.println(item);
		
		String[] stringarray2 = new String[5];
		stringarray2[0] = "this";
		stringarray2[1] = "is";
		stringarray2[2] = "a";
		stringarray2[3] = "string";
		stringarray2[4] = "array";
		for(String item : stringarray2) System.out.println(item);
	}

}
