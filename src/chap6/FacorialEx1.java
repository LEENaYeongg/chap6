package chap6;
/* ����Լ� : Recursive Call
 * 		     �ڱ� �ڽ��� �Լ��� �ٽ� ȣ���ϴ� �Լ�.
 * */
public class FacorialEx1 {
	public static void main(String[] args) { //Ŭ���� ���
		System.out.println("4!=" + factorial(4));
	//	System.out.println("4!=" + new FactorialEx1.factorial(4)); ==> ��üȭ �� ��.
	}

	private static int factorial(int i) { //static �� �ʿ�! 
		return (i==1)?1:i*factorial(i-1);
	}

}
