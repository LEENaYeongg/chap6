package chap6;
/*2. ���� ����� ��µǵ��� ����Ŭ������ ����Ŭ����(Test2)�� �����ϱ� 
����Ŭ����(Animal)
     ������� : �̸�(name), ����(age)
     ����޼���: eat() ;
     ��� : ���ְ� ��� ���

[���]
�̸�(name):������
����(age):20
���ְ� ���
 * */
class Animal {
	String name;
	int age;
	String f;

	
}
public class Test2_0922 {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "������";
		ani.age = 20;
		ani.f = "���ְ� ���";
		System.out.println("�̸�(name):" + ani.name);
		System.out.println("����(age):" + ani.age);
		System.out.println(ani.f);
	}
}
