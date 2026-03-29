package task;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int total = 0;
		if (str.length() == 10) {
			for (int i = 0; i < str.length(); i++) {
				total += str.charAt(i);
			}
			System.out.println("아스키코드의 합 : " + total);
		} else System.out.println("글자 수를 10개로 맞춰주십시오.");
	} // main ed
}
