package chap6;

/* 지역변수 예제 : 지역변수는 반드시 초기화 되어야 한다.
 * 
 * 
 * */
public class LocalValEx1 {

	public static void main(String[] args) {
		int num;
		boolean b = true ; //무조건 초기화 해야함.
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
		default : grade = "D"; break; //default 필수!
		}
		System.out.println(grade);
	}

}
