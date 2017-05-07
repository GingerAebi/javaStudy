package variable;

public class MainClass {
	public static void main(String args[]) {
		System.out.println("Variables 클래스의 클래스변수 :" + Variables.name);
		
		Variables var = new Variables("문자열",  0, 1.23f, 12);
		
		System.out.println("Variables 클래스의 인스턴스 var의 인스턴스변수 string : " + var.string);
		var.string = "바뀐 값";
		System.out.println("Variables 클래스의 인스턴스 var의 인스턴스변수 integer : " + var.integer);
		System.out.println("age :" + var.getAge());

		System.out.println("Variables 클래스의 인스턴스 var의 인스턴스변수 floats : " + var.getFloats());
		
	}
}
