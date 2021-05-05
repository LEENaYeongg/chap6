package chap6;
/*메서드 구성
 * [접근제어자] 리턴타입 메서드이름(매개변수 목록) => 선언부
 * {
 * 		문장들;						 => 구현부
 * }
 * 
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형
 * 			void : 값의 전달 없는 경우.
 * 			자료형 : 자료형에 해당하는 값을 리턴.
 * 매개변수 : 메서드 호출시 전달되는 값의 자료형과 변수명을 지정함.
 * 		      매개변수가 없을 수 있다. ()로 표현함.
 * return : 메서드 종료.
 * 		        리턴타입이 void 인경우 생략 가능. 메서드 끝의 }를 만나면 매서드 종료.
 * 	                 리턴타입이 void가 아닌 경우 생략 불가. => return 값;
 * */

class Math1 {
	int add1(int a, int b) { // add라는 메서드를 호출하고 나면 a,b에 입력할게~
		return a+b;
	}
	long add2(int a, int b) { //double로 하면 안됨
		return a+b; //자동형변환 리턴형으로 리턴
	}
	void add3(int a, int b) {
		System.out.println(a+b);
		return; //생략가능.
	}
}

public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1= new Math1();
		int a1 = m1.add1(10,20); //
		System.out.println(a1);
		long a2 = m1.add2(10,20); //return 타입에 의해서 타입에 맞도록 입력해야함.
		System.out.println(a2);

	}

}
