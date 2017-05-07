package class_extend_interface;

public class Dog extends Animal {

	String kindOfDog;
	
	public Dog(String name, int age, String kindOfDog) {
		super(name, age, 4);
		this.kindOfDog = kindOfDog;
	}
	
	public void say() {
		System.out.println("멍멍!");
	}
	
	
	public void introduce() {
		System.out.println("멍멍이 " + this.name + "의 나이는 " + this.age + "입니다.");
		System.out.println("멍멍이 " + this.name + "의 다리개수는 " + this.legCount + "입니다.");
	}

	@Override
	public void punch() {
		this.mana -= 10;
		System.out.println("멍멍이의 펀치다.");
		
	}

	@Override
	public void kick() {
		this.mana -= 20;
		System.out.println("멍멍이의 발차기다.");
	}
	  
	//Cat 클래스 만들어보기 
	//introduce 오버라이딩
}
