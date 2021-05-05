package chap6;
/*	20 ~ 50������ ������ ����, ���� ���̸� ���� �簢�� 5���� �����ϰ�,
	 ��� �簢���� ����, �ѷ��� ���� ����ϱ�
	 ������ �簢���� ��ȣ, ����, ����, ������ �簢���� ����, ����, �ѷ� ����ϱ�
 * 
 * */
class Rectangle3 {
	int width, height, serialNo;
	static int sno;
	int area() {
		return width * height;
	}
	int length() {
		return 2 * (width + height);
	}
	boolean isSquare() {
		return width == height;
	}
	public String toString() {
		return serialNo + "�� �簢��: (" + width + "," + height + ")" + 
	" ���ݱ��� ������ �簢�� ���� :" + sno + "����: " + area() + ", �ѷ�:" + length();
	}
}     
public class Exam2 {

	public static void main(String[] args) {
	Rectangle3[] rarr = new Rectangle3 [5]; //Rectangle�� ������ �������� 5���� ����ڴٴ� �ǹ�.
	
	int lengsum=0;
	int areasum=0;
	
	for(int i=0; i<rarr.length; i++) {
		rarr[i] = new Rectangle3();
		
		rarr[i].width = (int)(Math.random()*30)+21;
        rarr[i].height = (int)(Math.random()*30)+21;
        rarr[i].serialNo = ++rarr[i].sno;
        
        System.out.println(rarr[i]);
        lengsum += rarr[i].length();
        areasum += rarr[i].area();
	}  
	
	System.out.println("��ü �簢�� ������ ��: "+lengsum+", ��ü �簢�� �ѷ��� ��: "+areasum);
	}
}
