package class_extend_interface;

public class Horse extends Animal {
	private String kindOfHorse;

	public Horse(String name, int age, String kindOfHorse) {
		super(name, age, 4);
		this.kindOfHorse = kindOfHorse;
	}

	public String getkindofHorse() {
		return this.kindOfHorse;
	}

	@Override
	public void say() {
		System.out.println("히이이잉");
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

}
