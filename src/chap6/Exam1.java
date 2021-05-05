package chap6;
/*
 * width(가로), height(세로)를 멤버 변수로,
 * area(), length()를 멤버 메서드로 가지고 있는
 * Rectangle 클래스 구현하기
 * */
class Rectangle{
	int width, height;
	void area() {
		System.out.println("넓이:" + (width * height));
	}

	void length() { 
		System.out.println("둘레:"+(width + height)*2);
	}
}
public class Exam1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(); //r1이 참조하고 있다.
		Rectangle r2 = new Rectangle();
		r1.width =10;
		r1.height = 10;
		r1.area(); //area메서드 호출
		r1.length();
		r2.width =5;
		r2.height = 20;
		r2.area();
		r2.length();
	}
}
