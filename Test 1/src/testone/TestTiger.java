package testone;

public class TestTiger {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		
		t.name = "Tony";
		t.size = 10;
		t.age = 4.5;
		t.breed = "Bengal";
		
		System.out.println(t.name + " is a big tiger. He is " + t.size
				+ " feet long but only " + t.age + " years old. This is big for " + t.breed + " tigers.");
		
		t.roar();
		t.run("bear", 12);
		
		System.out.println("The tiger is " + t.getColor() + " with black stripes");
		System.out.println("The tiger pounces an average of " + t.pounce(20) + " feet");
		
		boolean bool = false;
		
		if(bool == true)
			System.out.println("A tiger would totaly beat a bear in a fight");
		else
			System.out.println("A bear would beat a tiger in a fight");	

	}

}
