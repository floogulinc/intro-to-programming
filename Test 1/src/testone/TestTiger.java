package testone;

public class TestTiger {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		
		t.name = "Tony";
		t.size = 10;
		t.age = 4.5;
		t.breed = "Bengal";
		
		System.out.println(t.name + " is a big tiger. He is " + t.size
				+ " feet long but only " + t.age + " years old. This is big for " + t.breed + " tigers."); //Tony is a big tiger. He is 10 feet long but only 4.5 years old. This is big for Bengal tigers.
		
		t.roar(); //ROAR
		t.run("bear", 12); //The tiger runs past a bear which is 12 feet tall
		
		System.out.println("The tiger is " + t.getColor() + " with black stripes"); //The tiger is orange with black stripes
		System.out.println("The tiger pounces an average of " + t.pounce(20) + " feet"); //The tiger pounces an average of 20 feet
		
		boolean bool = false;
		
		if(bool == true)
			System.out.println("A tiger would totaly beat a bear in a fight");
		else
			System.out.println("A bear would beat a tiger in a fight");	//A bear would beat a tiger in a fight

	}

}
