package task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strA = str.split(" ");
		int num = 0;
		System.out.println(Arrays.toString(strA));
		for (int i = 0; i < strA.length; i++) {
			String word = strA[i].toLowerCase();
			for (int j = 0; j < word.length(); j++) {
				if ("aeiou".indexOf(word.charAt(j)) != -1) {
					num++;
				} // if ed
			}
			System.out.println(strA[i] + "의 모음 개수 : " + num);
			num = 0;
		}
	} // main ed
} // class ed

// 단어 별로 쪼개고, 단어를 다 소문자로 변환, 다시한번 글자별로 쪼개서 모음 갯수 계산 후 출력