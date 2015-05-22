package interfaces;

public class Word implements MSOffice{

	@Override
	public void New() {
		System.out.println("Word New");
	}

	@Override
	public void Save() {
		System.out.println("Word Save");
	}
	
	public void Save(int x) {
		System.out.println("Word Save Overload");
	}

	@Override
	public void Open() {
		System.out.println("Word Open");
	}

}
