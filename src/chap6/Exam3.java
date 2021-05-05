package chap6;
/*
 * ���� Ŭ������ ���� ���� �� ����� ��µǵ��� SutdaCardŬ������ �����ϱ�.
 * ��� ������ int number, boolean isKwang �� �ִ�.
 * [���]
 * 3
 * 1K
 * */

class SutdaCard {
	int number;
	boolean isKwang;

	SutdaCard(int n, boolean i) { //card1 �� �Ű����� �ʿ�  .
		number = n;
		isKwang = i;
	}

	SutdaCard() { // card2 �� �Ű����� ���� �����ڰ� �ʿ�. �ֳĸ� �⺻ ������.
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
