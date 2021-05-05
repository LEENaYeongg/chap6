package chap6;
/* 추상화 : 클래스 생성의 과정
 * 클래스 : 사용자 정의 자료형
 * 		  속성 :멤버 변수
 *       기능 :멤버 메서드
 * */

class Phone { //전화기의 정보
	String color;
	boolean power;
	String no;
	void power() { //전원을 켜는 기능.
		power = !power;
	}
	void send(String no) { // 전화를 거는 기능.
		System.out.println(no + "번호로 전화 송신 중 ~~~");
	}
	void receive(String no) { // 전화를 받는 기능.
		System.out.println(no + "번호에서 전화 수신 중 ~~~");
	}
}
// 구동클래스 : main 메서드를 가지고 있는 클래스.
public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone(); // 객체화. 인스턴스화.
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01098765432");
		p1.receive("01098765432");
		Phone p2 = new Phone(); // 객체화. 인스턴스화.
		p2.color = "빨강";
		p2.power = false;
		p2.no ="01098765432";
	    p2 = p1; //==> p1,p2 둘 다 검정으로 나옴. 이전의 p2 객체가 소멸됨. p1,p2 참조변수가 같은 객체를 참조한다.
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color +","+p2.power +"," + p2.no);
	}

}
