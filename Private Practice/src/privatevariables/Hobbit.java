package privatevariables;

public class Hobbit {
	
	private int age;
	private double size;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		double maxsize = 4;
		double replacesize = 3;
		if(size >= maxsize) {
			System.out.println("Size cannot be bigger than " + maxsize + ", size has been set to " + replacesize);
			this.size = replacesize;
		} else
			this.size = size;
	}
	
}
