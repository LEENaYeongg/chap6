package chap6;

/*���� Ŭ������ ���� ������ ������ ����� �������� Animal2 Ŭ������ �����ϱ�
[���]
������:26��
����:1��
���:100��
 * */
class Animal2 {
	String name;
	int age;
	String info;

	void info() {
		System.out.println(name + ":" + age + "��");
	}

	Animal2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Animal2() {
		System.out.println("Animal()");
	}

	Animal2(String name) {
		this(name, 1);
	}

	Animal2(int age) {
		this("���", age);
	}

	public String toString() {
		return name + ":" + age + "��";
	}
}
public class Test1_0923 {
	public static void main(String[] args) {
		Animal2 a1 = new Animal2("������", 26);
		Animal2 a2 = new Animal2("����");
		Animal2 a3 = new Animal2(100);
		a1.info();
		a2.info();
		a3.info();
	}
}
