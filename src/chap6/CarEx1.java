package chap6;
/*
 * 선언위치에 따른 변수의 종류
 * 		              선언 위치        선언 방법				메모리 할당 시점					메모리할당위치
 * 클래스변수 :  클래스 내부        static int num;		클래스 정보 로드시					클래스 영역
 * 											(클래스변수가 제일먼저메모리 할당.)
 * 인스턴스 변수: 클래스 내부       int num;			객체화시 						힙영역
 * 
 * 지역변수 :    메서드 내부       int num;			선언문 실행시					스택영역
 * 
 * 
 * */
class Car { //Car 클래스 선언
	String color; //인스턴스 변수, 객체 변수
	int number; //인스턴스 변수, 객체 변수
	static int width = 200; //클래스 변수
	static int height = 120; //클래스 변수
	public String toString() {
		return color + ":" +number + "(" +width + "," + height + ")";
	}
}

public class CarEx1 {
	public static void main(String[] args) {
		System.out.println("자동차의 크기:" +  Car.width + "," +Car.height);
		Car car1 = new Car(); //객체화. 인스턴스 변수들이 메모리 힙영역에 할당됨.
		car1.color = "White"; //
		car1.number = 1234;
		//참조변수를 화면출력시 자동으로 toString() 메서드 호출됨
		//toString() : 객체를 문자열로 변환시키는 메서드
		System.out.println("car1" +  car1);
		Car car2 = new Car(); //객체화
		System.out.println("");
		car2.color = "Black";
		car2.number = 2345;
		System.out.println("car2" +  car2);
		Car.width = 300; //클래스변수 호출시 클래스명.변수명으로 호출함.
		car1.height = 200; //참조변수명.클래스변수명 사용시 경고 메세지 표시.
		System.out.println("car1" +  car1);
		System.out.println("car2" +  car2);
	}

}
