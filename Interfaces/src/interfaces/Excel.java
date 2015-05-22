package interfaces;

public class Excel implements MSOffice{

	@Override
	public void New() {
		System.out.println("Excel New");
	}

	@Override
	public void Save() {
		System.out.println("Excel Save");
	}

	@Override
	public void Open() {
		System.out.println("Excel Open");
	}

}
