package chap6;

// str 문자열에 각각의 알파벳의 갯수를 출력하시오.
// 
public class Test5_0922 {

	public static void main(String[] args) {

		String str = "the unemployment rates for african americans hispanic-americans, and asian americans";
		int[] alp = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				alp[ch - 'a']++;
		}

		for (int i = 0; i < alp.length; i++) {
			if (alp[i] != 0)
				System.out.printf("%c:%d개\n", i + 'a', alp[i]);
		}
	}
}
