package chap6;
/*�޼��� ����
 * [����������] ����Ÿ�� �޼����̸�(�Ű����� ���) => �����
 * {
 * 		�����;						 => ������
 * }
 * 
 * ����Ÿ�� : �޼��� ���� �� ���޵Ǵ� ���� �ڷ���
 * 			void : ���� ���� ���� ���.
 * 			�ڷ��� : �ڷ����� �ش��ϴ� ���� ����.
 * �Ű����� : �޼��� ȣ��� ���޵Ǵ� ���� �ڷ����� �������� ������.
 * 		      �Ű������� ���� �� �ִ�. ()�� ǥ����.
 * return : �޼��� ����.
 * 		        ����Ÿ���� void �ΰ�� ���� ����. �޼��� ���� }�� ������ �ż��� ����.
 * 	                 ����Ÿ���� void�� �ƴ� ��� ���� �Ұ�. => return ��;
 * */

class Math1 {
	int add1(int a, int b) { // add��� �޼��带 ȣ���ϰ� ���� a,b�� �Է��Ұ�~
		return a+b;
	}
	long add2(int a, int b) { //double�� �ϸ� �ȵ�
		return a+b; //�ڵ�����ȯ ���������� ����
	}
	void add3(int a, int b) {
		System.out.println(a+b);
		return; //��������.
	}
}

public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1= new Math1();
		int a1 = m1.add1(10,20); //
		System.out.println(a1);
		long a2 = m1.add2(10,20); //return Ÿ�Կ� ���ؼ� Ÿ�Կ� �µ��� �Է��ؾ���.
		System.out.println(a2);

	}

}
