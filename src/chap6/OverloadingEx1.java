package chap6;
/*오버로딩 예제
 * 1. 클래스 내부에 같은 이름의 메서드가 여러가 존재할 수 있다.
 * 2. 단 매래변수 목록이 달라야 한다. (자료형, 갯수, 순서)
 * 
 * */
class Math2 {
	int a=100;
	int add(int b) {
		System.out.print("1: ");
		return a+b;
	}
	double add(double b) {
		System.out.print("2: ");
				return a+b;
	}
	String add(String b) {
		System.out.print("3: ");
		return a+b;
	}
}
public class OverloadingEx1 {
	public static void main(String[] args) {
	Math2 m = new Math2();
	System.out.println(m.add(10));
	System.out.println(m.add(10.5));
	System.out.println(m.add("번"));
	}

}
