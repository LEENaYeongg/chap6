package chap6;
/*
 * width(����), height(����)�� ��� ������,
 * area(), length()�� ��� �޼���� ������ �ִ�
 * Rectangle Ŭ���� �����ϱ�
 * */
class Rectangle{
	int width, height;
	void area() {
		System.out.println("����:" + (width * height));
	}

	void length() { 
		System.out.println("�ѷ�:"+(width + height)*2);
	}
}
public class Exam1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(); //r1�� �����ϰ� �ִ�.
		Rectangle r2 = new Rectangle();
		r1.width =10;
		r1.height = 10;
		r1.area(); //area�޼��� ȣ��
		r1.length();
		r2.width =5;
		r2.height = 20;
		r2.area();
		r2.length();
	}
}
