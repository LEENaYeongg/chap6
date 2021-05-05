package chap6;

public class MemnerCallEx1 {
	static int cv1 = 10; //static이 존재하므로 클래스가 메모리 로드될때 메모리 할당.
	static int cv2 = cv1; //이미 할당받은 cv1의 값을 cv2가 받음.
	// 클래스 멤버들간의 접근.
	int iv1 = 100;
	int iv2 = iv1; // 인스턴스 멤버간의 접근
	int iv3 = cv1; // 인스턴스 멤버에 클래스 멤버 접근
//	static int cv3 = iv1; // 클래스 멤버에서 인스턴스 멤버 접근 직접 접근 불가.
	                      // iv1은 객체화 되야 메모리를 할당받기 때문.
	static int cv3 = new MemnerCallEx1().iv1; //일회용 객체 생성
	void method1() { // 인스턴스 메서드
		System.out.println("cv1 + cv2 ="+ (cv1+cv2)); //인스턴스 멤버 메서드에서 클래스 멤버 호출
		System.out.println("iv1 + iv2 ="+ (iv1+iv2)); //인스턴스 멤버 메서드에서 같은 인스턴스 멤버 호출
	}
	static void method2() { // 클래스 메서드
		System.out.println("cv1 + cv2 ="+ (cv1+cv2));
//		System.out.println("iv1 + iv2 ="+ (iv1+iv2)); //iv1,iv2는 정보만 있지 메모리가 없음. 따라서 할당 불가능.
													  //클래스 멤버에서 인스턴스 멤버 접근 직접 접근 불가.
		MemnerCallEx1 m = new MemnerCallEx1();
		System.out.println("iv1 + iv2 ="+ (m.iv1+m.iv2)); // 객체 생성
	}
	
	public static void main(String[] args) { //클래스 메서드
//	method1(); // 에러나는 이유 : 클래스 메서드에서 인스턴스 메서드를 호출하려고 하기 때문.
		new MemnerCallEx1().method1(); // 에러 해결을 위해 객체화 필요
	method2(); // 같은 static때문에 호출 가능.


	}

}
