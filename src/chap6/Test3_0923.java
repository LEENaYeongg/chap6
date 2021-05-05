package chap6;

/*3. 17개의 요소를 가지고 있는 배열 arr을 정렬하여 다음 결과와 같이 출력하기.

단 Arrays.sort() 함수는 사용하지 않기
int arr[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,15,13,9,31}; 

[결과]
50 44 33 31 29 
   28 25 17 
      16 
   15 13  9  
 8  7  5  2  1 
 * 
 * ==> 오름차순 정렬
 * 
 * */
public class Test3_0923 {
	public static void main(String[] args) {
		int arr[] = { 50, 7, 5, 8, 1, 33, 16, 2, 28, 25, 29, 17, 44, 15, 13, 9, 31 };
		int[][] result = new int[5][5];
		int cnt=0, tmp=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				for ( i = 0; i < 17; i++) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
