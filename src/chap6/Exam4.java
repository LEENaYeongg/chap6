package chap6;

/*
 * Exam2.java ���� ���α׷��� �����Ͽ� ������ ����� ��������
 * Rectangle4 Ŭ�� �����ϱ�
 * [���]
 * 1/5 �簢�� : (10,20) ���� :200, �ѷ�:60
 * 2/5 �簢�� : (15,25) ���� :375, �ѷ�:80
 * 3/5 �簢�� : (20,30) ���� :600, �ѷ�:100
 * ...
 * ��ü �簢�� ������ �� :1175
 * ��ü �簢�� �ѷ��� �� :240
 */
class Rectangle4 {
	int width;
	int height;
	int serialNo;
	static int sno;

	Rectangle4(int w, int h) {
	      this.width = w;
	      height = h;
	      serialNo = ++sno;
	   }

	int area() {
		return width * height;
	}

	int length() {
		return (width + height) * 2;
	}

	public String toString() {
		return serialNo + "/" + sno + "(" + width + "," + height + ") ���� :" + area() + "�ѷ� :" + length();
	}
}

public class Exam4 {

	public static void main(String[] args) {
		Rectangle4[] rarr = new Rectangle4[5];
		int totarea = 0;
		int totlength = 0;
		for (int i = 0; i < rarr.length; i++) {
			int width = (int) (Math.random() * 31) + 20;
			int height = (int) (Math.random() * 31) + 20;
			rarr[i] = new Rectangle4(width, height);
			totarea += rarr[i].area();
			totlength += rarr[i].length();

		}
		for (Rectangle4 r : rarr) {
			System.out.println(r);
		}
		System.out.println("��ü �簢�� ������ �� :" + totarea);
		System.out.println("��ü �簢�� �ѷ��� �� :" + totlength);
	}

}