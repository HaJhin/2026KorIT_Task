package task;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		String str[] = email.split("@");
		if (str.length < 2) System.out.println("양식에 맞춰 작성해주십시오.");
		else { 
			System.out.println("[사용자 정보]");
			System.out.println("아이디 : " + str[0]);
			System.out.println("도메인 : " + str[1]);
		}
	}
}
