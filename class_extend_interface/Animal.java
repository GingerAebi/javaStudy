package class_extend_interface;

//추상 클래스로 변환 
public abstract class Animal extends Fighter {
	String name;
	int age;
	int legCount;

	public Animal(String name, int age, int legCount) {
		this.name = name;
		this.age = age;
		this.legCount = legCount;
	}

	public void introduce(){
		System.out.println("동물 " + this.name + "의 나이는 " + this.age + "입니다.");
		System.out.println("동물 " + this.name + "의 다리개수는 " + this.legCount + "입니다.");
	}
	
	public abstract void say();
}
