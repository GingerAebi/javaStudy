package class_extend_interface;

public class MainClass {
	public static void main(String args[]) {
		//각 클래스 사용 예제
		Cat cat = new Cat("고양이", 2, "얼룩고양이");
		Dog dog = new Dog("멍멍이", 10, "동네 강이지");
		Animal a = new Dog("멍멍이다", 2, "멍멍이네 멍멍이");
	
		//Animal 배열 
		Animal[] arrayOfAnimal = {dog, cat, a};
		FighterInterface[] fighters = {dog, cat, a, new People()};
		
		for(FighterInterface fighter : fighters) {
			fighter.punch();
		}
		
		for (int i = 0; i < arrayOfAnimal.length; i++) {
			Animal animal = arrayOfAnimal[i];
			animal.introduce();
			animal.say();
			System.out.println("");
		}
	}
}
