package chap6;
/*������ ����
 * �����ڶ� ��üȭ�� ȣ��Ǵ� �޼����̴�.
 * ������ ���� ��ü ������ �Ұ����ϴ�.
 * ������ �ֿ� ����� �ν��Ͻ� ������ �ʱ�ȭ�̴�.
 * 
 * �⺻������
 * Ŭ���� ���ο� ������ �������� ������ �����Ϸ��� �ڵ����� �߰��� �ִ� ������.
 * 
 * ������ ����
 * 1. �������� �̸��� Ŭ������� ����.
 * 2. ����Ÿ���� ����. void�� ������� �ʴ´�.
 * 		Ŭ������();
 * 
 * */

class Number1 { //�⺻������ ����
	int num;
}

class Number2 { //�⺻������ �����ȵ�
	int num;

	Number2(int x) { // ������
		num = x;
	}
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1(); //��üȭ
		Number2 n2 = new Number2(20); //��üȭ
		/* new ����� ��� ==> String Ŭ������ new�� ��ü���� ���ص���.
		 * 1. �޸� �Ҵ�
		 * 2. �⺻�� �ʱ�ȭ. ����� �ʱ�ȭ.
		 *     boolean(����) : false; ����:0, ������: null;
		 * 3. ������ ȣ�� Number1() ������
		 * 
		 * */
		System.out.println(n1.num); //0
		System.out.println(n2.num); //20
	}
}

