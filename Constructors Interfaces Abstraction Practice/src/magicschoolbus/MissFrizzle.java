package magicschoolbus;

public class MissFrizzle extends Teacher implements Sorcerer {
	
	public MissFrizzle(String dressType, int yearsTeaching) {
		this.dressType = dressType;
		this.yearsTeaching = yearsTeaching;
	}
	
	public MissFrizzle(String dressType) {
		this(dressType, 10);
	}
	
	public MissFrizzle(int yearsTeaching) {
		this("polka dot", yearsTeaching);
	}
	
	public MissFrizzle() {
		this("polka dot", 10);
	}

	@Override
	public void shrinkItem() {
		System.out.println("Shrinks item");
	}

	@Override
	public void timeTravel() {
		System.out.println("Travels in time");
	}

	@Override
	public void teach() {
		System.out.println("Teaches");
	}

}
