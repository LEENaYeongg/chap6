package chap6;
/*Coin Ŭ������ �̿��ϱ�.
 * �ΰ��� Coin ��ü�� �����ϱ� myCoin, youCoin ��ü �����ϱ�
 * �ո��� �������ؼ� 3�� ������ �¸�. => myCoin �¸�, youCoin �¸�, ���.
 * 
 * */

class Coin1{
	int side;
	void flip() { //flip�� side�� �ٲٴ� ����
		side = (int)(Math.random()*2);
	}


}
public class Exam5 {
	public static void main(String[] args) {
		Coin1 myCoin = new Coin1();
		Coin1 youCoin = new Coin1();
		int mycount = 0, youcount = 0;
		System.out.println("myCoin\tyouCoin");
		while(true){
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side == 0){
				System.out.print("�ո�\t");
				mycount++;
			}else{
				System.out.print("�޸�\t");
				mycount = 0;
			}			
			if(youCoin.side == 0){
				System.out.print("�ո�\n");
				youcount++;
			}else{
				System.out.print("�޸�\n");
				youcount = 0;
			}			
			if(mycount == 3 || youcount == 3)
				break; 
		} //while ����
		
		if(mycount > youcount)
			System.out.println("myCoin �¸�");
		else if(mycount < youcount)
			System.out.println("youCoin �¸�");
		else
			System.out.println("���");
	}
}
