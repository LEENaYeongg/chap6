package chap6;
/*3. ������ ǥ���ϴ� Coion Ŭ���� �����ϱ�

      ������� :  ������ ��(side)
      ����޼��� : flip() 
      ��� : ������ ���� ������ ���� �����Ѵ�. Math.random() �޼��� �̿�. �ո�,�޸� �����.
 * 
 * */

/*==> ó�� �ڵ� boolean�� �ȵǴ� ����?
 * 	   int side;
	   boolean flip() { //flip�� �޸��̳� �ո��̳ĸ� ��Ÿ���� ������ �����Լ��� ǥ��
	   					// ����, flip�� �ʱ�ȭ ��Ű�� �ʾұ� ������ ������ �ʱⰪ 0�̶� ������ �ո����� ��µǴ� ���̴�.
		   return side == 0;
	   }
	   public String toString() {
		   return  flip()?"�ո�":"�޸�" + side;
	   }
	   */
class Coin {
	int side;
	int flip() {
		return side = (int)(Math.random()*2);
	}
	public String toString() {
		   return  (side ==0)?"�ո�":"�޸�";
	}
	
	}
public class Test3_0922 {
	public static void main(String[] args) {
		  Coin coin = new Coin();
		  coin.flip();
		  System.out.println(coin);
	}
}
