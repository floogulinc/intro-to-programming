package privatevariables;

public class Ogre {
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
		int minsize = 20;
		double replacesize = 25;
		if(size <= minsize) {
			System.out.println("Size cannot be smaller than " + minsize
					+ ", size has been set to " + replacesize);
			this.size = replacesize;
		} else
			this.size = size;
	}
}