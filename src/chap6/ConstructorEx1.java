package chap6;
/*생성자 예제
 * 생성자란 객체화시 호출되는 메서드이다.
 * 생성자 없이 객체 생성은 불가능하다.
 * 생성자 주요 기능은 인스턴스 변수의 초기화이다.
 * 
 * 기본생성자
 * 클래스 내부에 생성자 구현하지 않으면 컴파일러가 자동으로 추가해 주는 생성자.
 * 
 * 생성자 구현
 * 1. 생성자의 이름은 클래스명과 같다.
 * 2. 리턴타입이 없다. void도 기술하지 않는다.
 * 		클래스명();
 * 
 * */

class Number1 { //기본생성자 제공
	int num;
}

class Number2 { //기본생성자 제공안됨
	int num;

	Number2(int x) { // 생성자
		num = x;
	}
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1(); //객체화
		Number2 n2 = new Number2(20); //객체화
		/* new 예약어 기능 ==> String 클래스는 new로 객체생성 안해도됨.
		 * 1. 메모리 할당
		 * 2. 기본값 초기화. 명시적 초기화.
		 *     boolean(논리형) : false; 숫자:0, 참조형: null;
		 * 3. 생성자 호출 Number1() 생성자
		 * 
		 * */
		System.out.println(n1.num); //0
		System.out.println(n2.num); //20
	}
}

