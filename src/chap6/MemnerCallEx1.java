package chap6;

public class MemnerCallEx1 {
	static int cv1 = 10; //static�� �����ϹǷ� Ŭ������ �޸� �ε�ɶ� �޸� �Ҵ�.
	static int cv2 = cv1; //�̹� �Ҵ���� cv1�� ���� cv2�� ����.
	// Ŭ���� ����鰣�� ����.
	int iv1 = 100;
	int iv2 = iv1; // �ν��Ͻ� ������� ����
	int iv3 = cv1; // �ν��Ͻ� ����� Ŭ���� ��� ����
//	static int cv3 = iv1; // Ŭ���� ������� �ν��Ͻ� ��� ���� ���� ���� �Ұ�.
	                      // iv1�� ��üȭ �Ǿ� �޸𸮸� �Ҵ�ޱ� ����.
	static int cv3 = new MemnerCallEx1().iv1; //��ȸ�� ��ü ����
	void method1() { // �ν��Ͻ� �޼���
		System.out.println("cv1 + cv2 ="+ (cv1+cv2)); //�ν��Ͻ� ��� �޼��忡�� Ŭ���� ��� ȣ��
		System.out.println("iv1 + iv2 ="+ (iv1+iv2)); //�ν��Ͻ� ��� �޼��忡�� ���� �ν��Ͻ� ��� ȣ��
	}
	static void method2() { // Ŭ���� �޼���
		System.out.println("cv1 + cv2 ="+ (cv1+cv2));
//		System.out.println("iv1 + iv2 ="+ (iv1+iv2)); //iv1,iv2�� ������ ���� �޸𸮰� ����. ���� �Ҵ� �Ұ���.
													  //Ŭ���� ������� �ν��Ͻ� ��� ���� ���� ���� �Ұ�.
		MemnerCallEx1 m = new MemnerCallEx1();
		System.out.println("iv1 + iv2 ="+ (m.iv1+m.iv2)); // ��ü ����
	}
	
	public static void main(String[] args) { //Ŭ���� �޼���
//	method1(); // �������� ���� : Ŭ���� �޼��忡�� �ν��Ͻ� �޼��带 ȣ���Ϸ��� �ϱ� ����.
		new MemnerCallEx1().method1(); // ���� �ذ��� ���� ��üȭ �ʿ�
	method2(); // ���� static������ ȣ�� ����.


	}

}
