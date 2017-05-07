package class_extend_interface;

public class Cat extends Animal {
		
	private String kindOfCat;

	public Cat(String name, int age, String kindOfCat) {
		super(name, age, 4);
		this.kindOfCat = kindOfCat;
	}
	
	public String getKindOfCat() {
		return this.kindOfCat;
	}
	
	@Override
	public void say() {
		System.out.println("야옹");
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
