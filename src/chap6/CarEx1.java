package chap6;
/*
 * ������ġ�� ���� ������ ����
 * 		              ���� ��ġ        ���� ���				�޸� �Ҵ� ����					�޸��Ҵ���ġ
 * Ŭ�������� :  Ŭ���� ����        static int num;		Ŭ���� ���� �ε��					Ŭ���� ����
 * 											(Ŭ���������� ���ϸ����޸� �Ҵ�.)
 * �ν��Ͻ� ����: Ŭ���� ����       int num;			��üȭ�� 						������
 * 
 * �������� :    �޼��� ����       int num;			���� �����					���ÿ���
 * 
 * 
 * */
class Car { //Car Ŭ���� ����
	String color; //�ν��Ͻ� ����, ��ü ����
	int number; //�ν��Ͻ� ����, ��ü ����
	static int width = 200; //Ŭ���� ����
	static int height = 120; //Ŭ���� ����
	public String toString() {
		return color + ":" +number + "(" +width + "," + height + ")";
	}
}

public class CarEx1 {
	public static void main(String[] args) {
		System.out.println("�ڵ����� ũ��:" +  Car.width + "," +Car.height);
		Car car1 = new Car(); //��üȭ. �ν��Ͻ� �������� �޸� �������� �Ҵ��.
		car1.color = "White"; //
		car1.number = 1234;
		//���������� ȭ����½� �ڵ����� toString() �޼��� ȣ���
		//toString() : ��ü�� ���ڿ��� ��ȯ��Ű�� �޼���
		System.out.println("car1" +  car1);
		Car car2 = new Car(); //��üȭ
		System.out.println("");
		car2.color = "Black";
		car2.number = 2345;
		System.out.println("car2" +  car2);
		Car.width = 300; //Ŭ�������� ȣ��� Ŭ������.���������� ȣ����.
		car1.height = 200; //����������.Ŭ���������� ���� ��� �޼��� ǥ��.
		System.out.println("car1" +  car1);
		System.out.println("car2" +  car2);
	}

}
