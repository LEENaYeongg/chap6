package chap6;

/*4. ������ ���� ��� ������ ���� Student Ŭ������ ���� �Ͻÿ�

   ��� ����
          String name //�л��̸�
          int ban,no,kor,eng,math  //��,��ȣ,��������,��������,��������
   ��� �޼���
           1. getTotal
                       ��� : ����,����,���� ������ �� ��ȯ
           2. getAverage
                       ��� : ����(����,����,���� ������ ��) �� ������� ���� ��� ��ȯ
                        ����Ÿ�� : float
 * 
 * */
class Student {
	String name;
	int ban, no, kor, eng, math;
	static int sno;
	int getTotal() {
		return kor + eng + math;
	}
	//int getAverage() {
	//	return (kor + eng + math) / 3;
	
	float getAverage() {
		return getTotal()/3f;
	
	}
	public String toString() {
		return name + " " + ban + "�� " + no + "�� " + "�հ�:" + getTotal() + "  ���:" + getAverage();
	}
}

public class Test4_0922 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
