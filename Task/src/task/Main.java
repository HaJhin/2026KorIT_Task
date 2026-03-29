package task;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() -1 || str.charAt(i) != str.charAt(i+1)) {
				result += str.charAt(i) + String.valueOf(count);
				count = 1;
			} else count++;
		} // for ed
		System.out.println(result);
	} // main ed
} // Main ed
