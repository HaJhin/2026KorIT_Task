package task;

public class Main2 {
	public static void main(String[] args) {
		String txt = "나는 자바 프로그래밍을 공부합니다.";
		int num = txt.indexOf("프");
		System.out.println("단어가 시작되는 위치는 " + num + "번째입니다.");
		if (num == -1) System.out.println("찾을 수 없음");
	}
}
