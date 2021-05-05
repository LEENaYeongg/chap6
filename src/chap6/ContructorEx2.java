package chap6;

/*생성자는 오버로딩이 가능하다.
 * 
 * */
class Car2 {
	String color;
	int number;
	static int width = 200;
	Car2(String c, int n) {
		color = c;
		number = n;
	}
	Car2(String c){ //return 값을 설정하지 않는다. 생성자는 
		color =c;
		number=1111;
	}
	Car2(int n){
		color = "white";
		number =n;
	}
	public String toString() {
		return color + "," + number;
	}
}

public class ContructorEx2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2("blue", 1234);
		Car2 c2 = new Car2("red");
		Car2 c3 = new Car2(1234);
		System.out.println("c1:" + c1); //blue,1234
		System.out.println("c2:" + c2); //red,1111
		System.out.println("c3:" + c3); //white,1234

	}

}
