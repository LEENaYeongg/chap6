package chap6;
/* �߻�ȭ : Ŭ���� ������ ����
 * Ŭ���� : ����� ���� �ڷ���
 * 		  �Ӽ� :��� ����
 *       ��� :��� �޼���
 * */

class Phone { //��ȭ���� ����
	String color;
	boolean power;
	String no;
	void power() { //������ �Ѵ� ���.
		power = !power;
	}
	void send(String no) { // ��ȭ�� �Ŵ� ���.
		System.out.println(no + "��ȣ�� ��ȭ �۽� �� ~~~");
	}
	void receive(String no) { // ��ȭ�� �޴� ���.
		System.out.println(no + "��ȣ���� ��ȭ ���� �� ~~~");
	}
}
// ����Ŭ���� : main �޼��带 ������ �ִ� Ŭ����.
public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone(); // ��üȭ. �ν��Ͻ�ȭ.
		p1.color = "����";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01098765432");
		p1.receive("01098765432");
		Phone p2 = new Phone(); // ��üȭ. �ν��Ͻ�ȭ.
		p2.color = "����";
		p2.power = false;
		p2.no ="01098765432";
	    p2 = p1; //==> p1,p2 �� �� �������� ����. ������ p2 ��ü�� �Ҹ��. p1,p2 ���������� ���� ��ü�� �����Ѵ�.
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color +","+p2.power +"," + p2.no);
	}

}
