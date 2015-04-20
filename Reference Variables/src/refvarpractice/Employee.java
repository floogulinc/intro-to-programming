package refvarpractice;

public class Employee {
	
	double salary;
	double bonus;
	
	public Employee(double s, double b) {
		salary = s;
		bonus = b;
	}
	
	public void calculatetotalpay(){
		double pay = salary + bonus;
		System.out.println(pay);
	}

}
