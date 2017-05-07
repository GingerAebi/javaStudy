package variable;

public class Variables {
	public static String name = "변수";
	
	public String string;
	public int integer;
	private float floats;
	private int age;

	public Variables(String a, int b, float c, int age) {
		this.string = a;
		this.integer = b;
		this.floats = c;
		this.age = age;
	}

	public String getLocalString() {
		String localString = "안녕하세요";
		return localString;
	}

	public float getFloats() {
		return this.floats;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}