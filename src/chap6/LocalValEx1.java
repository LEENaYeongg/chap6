package chap6;

/* �������� ���� : ���������� �ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�.
 * 
 * 
 * */
public class LocalValEx1 {

	public static void main(String[] args) {
		int num;
		boolean b = true ; //������ �ʱ�ȭ �ؾ���.
		if (b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		String grade;
		int score=80;
		switch(score/10) {
		case 9 : grade = "A";break;
		case 8 : grade = "A";break;
		case 7 : grade = "A";break;
		default : grade = "D"; break; //default �ʼ�!
		}
		System.out.println(grade);
	}

}
