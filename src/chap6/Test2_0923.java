package chap6;
/* ��(Circle) Ŭ���� �����ϱ�

  1. �������
    ������(r),x��ǥ(x),y��ǥ(y), ���ǹ�ȣ(no)
    ���ǹ�ȣ ���� ���� count
  2. ������ : ���� Ŭ������ �µ��� �����ϱ� 
  3. ����޼���
       (1) double area() : ���� ���� ����. Math.PI ��� ���
       (2) double length(): ���� �ѷ� ����. Math.PI ��� ���
       (3) void move(int a, int b): x,y��ǥ�� x+a, y+b�� �̵�.
       (4) void scale(double m): �������� m�� Ȯ��/���. r=r*m
       (5) String toString() :
                1���� : ������:10, ��ǥ:(10,10), ����:314.xxx, �ѷ�:xxx.xxx
 * */

class Circle {
	int r, x, y, serialNo;
	static int sno;

	double area() {
		return r * r * Math.PI;
		
	}

	double length() {
		return 2 * r * Math.PI;
	}

	void move(int a, int b) {
		x += a;
		y += b;
	}

	void scale(double m) {
		r *= m;
	}

	public String toString() {
		return serialNo + "�� �� -������:" + r + ", " + "��ǥ:" + "(" + x + "," + y + "), ����:" + area() + ", �ѷ�:" + length();
	}

	Circle(int a, int b, int c) {
		this.r = a;
		this.x = b;
		this.y = c;
		serialNo = ++sno;
	}

	Circle(int a, int b) {
		this(a, b, 0);
	}

	Circle(int a) {
		this(a, 0, 0);
	}

}

public class Test2_0923 {

	public static void main(String[] args) {
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(10, 10, 10); // r,x,y
		carr[1] = new Circle(20, 20); // 1,x,y
		carr[2] = new Circle(100); // r,1,1
		
		for (Circle c : carr) {
			System.out.println(c);
			c.move(10, 10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
		
	}
}
