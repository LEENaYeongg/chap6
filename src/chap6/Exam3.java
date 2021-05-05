package chap6;
/*
 * 구동 클래스를 실행 했을 때 결과가 출력되도록 SutdaCard클래스를 구현하기.
 * 멤버 변수는 int number, boolean isKwang 가 있다.
 * [결과]
 * 3
 * 1K
 * */

class SutdaCard {
	int number;
	boolean isKwang;

	SutdaCard(int n, boolean i) { //card1 는 매개변수 필요  .
		number = n;
		isKwang = i;
	}

	SutdaCard() { // card2 는 매개변수 없는 생성자가 필요. 왜냐면 기본 생성자.
		number = 1;
		isKwang = true;
	}
	public String toString() {
		return number + ((isKwang)?"K":"");
	}
}

public class Exam3 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1); // 3
		System.out.println(card2); // 1K

	}

}
