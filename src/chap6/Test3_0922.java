package chap6;
/*3. 동전을 표현하는 Coion 클래스 구현하기

      멤버변수 :  동전의 면(side)
      멤버메서드 : flip() 
      기능 : 동전을 던져 동전의 면을 변경한다. Math.random() 메서드 이용. 앞면,뒷면 출력함.
 * 
 * */

/*==> 처음 코드 boolean이 안되는 이유?
 * 	   int side;
	   boolean flip() { //flip은 뒷면이나 앞면이냐를 나타내는 행위라서 랜덤함수로 표현
	   					// 또한, flip의 초기화 시키지 않았기 때문에 무조건 초기값 0이라서 무조건 앞면으로 출력되는 것이다.
		   return side == 0;
	   }
	   public String toString() {
		   return  flip()?"앞면":"뒷면" + side;
	   }
	   */
class Coin {
	int side;
	int flip() {
		return side = (int)(Math.random()*2);
	}
	public String toString() {
		   return  (side ==0)?"앞면":"뒷면";
	}
	
	}
public class Test3_0922 {
	public static void main(String[] args) {
		  Coin coin = new Coin();
		  coin.flip();
		  System.out.println(coin);
	}
}
