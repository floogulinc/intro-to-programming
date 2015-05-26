package privatevariables;

public class Hobbit {
		
	//Constructors
	
	public Hobbit(double s) {
		setSize(s);
	}
	
	public Hobbit() {
		this(3);
	}
	
	
	//Code from Private Practice project
	
	private double size;
	
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
