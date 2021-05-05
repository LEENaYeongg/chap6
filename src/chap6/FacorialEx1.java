package chap6;
/* 재귀함수 : Recursive Call
 * 		     자기 자신의 함수를 다시 호출하는 함수.
 * */
public class FacorialEx1 {
	public static void main(String[] args) { //클래스 멤버
		System.out.println("4!=" + factorial(4));
	//	System.out.println("4!=" + new FactorialEx1.factorial(4)); ==> 객체화 한 것.
	}

	private static int factorial(int i) { //static 꼭 필요! 
		return (i==1)?1:i*factorial(i-1);
	}

}
