package chap6;

/* this 예약어 예제
 * 
 * this() 생성자 : 클래스 내부의 다른 생성자 호출시 사용.
 * 				반드시 첫줄에 구현해야한다.
 * 
 * this 참조변수 : 자기참조 변수.
 * 				인스턴스 멤버를 참조할때 사용
 * 				인스터스 메서드만 사용가능함. => 인스턴스 메서드에 지역변수로 자동 설정됨.
 * 				지역변수와 멤버변수를 구분시 사용함.
 * 
 * */
class Car3 {
	String color;
	int number;
	int serialNo;
	static int sno;

	Car3(String color, int number) {
		System.out.println("Car(String, int)");
		this.color = color;
		this.number = number;
		serialNo = ++sno;
	}

	Car3() {
		System.out.println("Car()");
//		this("white", 1111); // this는 반드시 생성자의 첫줄에 작성해야한다. 아니면 에러!
//		color = "white";
//		number = 1111;
//		serialNo = ++sno;
	}

	Car3(String color) {
	//	System.out.println("Car(String)");
		this(color, 1111);
//	this.color = color;
//	number = 1111;
//	serialNo = ++sno;
	}

	Car3(int number) {
		this("white", number);
//	color = "white";
//	number =1111;
	}
	Car3(Car3 c){
		this(c.color, c.number); //c5는 c1의 값을 가져온다.
	}

	public String toString() {
		return serialNo + "번 자동차 : " + this.color + "," + this.number;
	}
}

public class ThisEx1 {
	public static void main(String[] args) {
		Car3 c1 = new Car3("blue", 1234);
		Car3 c2 = new Car3();
		Car3 c3 = new Car3("red");
		Car3 c4 = new Car3(1234);
		Car3 c5 = new Car3(c1);
		System.out.println(c1);// 1번 자동차: blue,1234
		System.out.println(c2);// 2번 자동차: white,1111
		System.out.println(c3);// 3번 자동차: red,1111
		System.out.println(c4);// 4번 자동차: white,1234
		System.out.println(c5);// 5번 자동차: blue,1234
	}
}
