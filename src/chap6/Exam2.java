package chap6;
/*	20 ~ 50사이의 임의의 가로, 세로 길이를 가진 사각형 5개를 생성하고,
	 모든 사각형의 넓이, 둘레의 합을 출력하기
	 각각의 사각형의 번호, 가로, 세로, 생성된 사각형의 갯수, 넓이, 둘레 출력하기
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
		return serialNo + "번 사각형: (" + width + "," + height + ")" + 
	" 지금까지 생성된 사각형 갯수 :" + sno + "넓이: " + area() + ", 둘레:" + length();
	}
}     
public class Exam2 {

	public static void main(String[] args) {
	Rectangle3[] rarr = new Rectangle3 [5]; //Rectangle을 참조할 참조변수 5개를 만들겠다는 의미.
	
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
	
	System.out.println("전체 사각형 면적의 합: "+lengsum+", 전체 사각형 둘레의 합: "+areasum);
	}
}
