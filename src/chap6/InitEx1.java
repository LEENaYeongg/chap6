package chap6;
/*초기화 블럭 예제
 * static 초기화 블럭
 * 		주요 기능 : 클래스 변수 초기화
 * 		실행 시점 : 클래스 정보 로드시 한번 실행.
 * 인스턴스 초기화 블럭
 * 		주요 기능 : 인스턴스 변수 초기화. 생성자와 기능이 겹침.
 *		실행 시점 : 객체화시 생성자 호출 전에 먼저 실행.
 * 		
 * */


public class InitEx1 {
static int cv;
int iv;
InitEx1() {
	System.out.println("5. 생성자 호출됨");
}
static { //static 초기화 블럭. 클래스 멤버. 가장 먼저 실행.
	cv = (int)(Math.random() * 100);
	System.out.println("1. static 초기화 블럭 실행. cv=" + cv); //한번만 실행되고 안됨.
}
{ //인스턴스 초기화 블럭
	iv = (int)(Math.random() * 100);
	System.out.println("4. static 초기화 블럭 실행. iv=" + iv);
}

	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main 메서드에서 init1 객체 생성");
		InitEx1 init1 = new InitEx1(); //생성자
		System.out.println("3. main 메서드에서 init2 객체 생성");
		InitEx1 init2 = new InitEx1(); //생성자
		System.out.println(InitEx1.cv);
		System.out.println(init1.iv);
		System.out.println(init2.iv);
	}
}
