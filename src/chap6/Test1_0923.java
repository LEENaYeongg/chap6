package chap6;

/*구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal2 클래스를 구현하기
[결과]
원숭이:26살
사자:1살
사람:100살
 * */
class Animal2 {
	String name;
	int age;
	String info;

	void info() {
		System.out.println(name + ":" + age + "살");
	}

	Animal2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Animal2() {
		System.out.println("Animal()");
	}

	Animal2(String name) {
		this(name, 1);
	}

	Animal2(int age) {
		this("사람", age);
	}

	public String toString() {
		return name + ":" + age + "살";
	}
}
public class Test1_0923 {
	public static void main(String[] args) {
		Animal2 a1 = new Animal2("원숭이", 26);
		Animal2 a2 = new Animal2("사자");
		Animal2 a3 = new Animal2(100);
		a1.info();
		a2.info();
		a3.info();
	}
}
