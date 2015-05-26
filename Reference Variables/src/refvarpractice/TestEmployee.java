package refvarpractice;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee alex, linda, john;
		alex = new Employee(90000, 20000);
		linda = new Employee(100000, 15000);
		john = new Employee(200000, 0);

		alex.calculatetotalpay(); //110000.0
		linda.calculatetotalpay(); //115000.0
		john.calculatetotalpay(); //200000.0
		
		Employee x = alex;
		
		x.calculatetotalpay(); //110000.0

	}

}
