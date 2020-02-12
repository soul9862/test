package Level1;

// 2016³â
public class Level1_38 {
	public String solution(int a, int b) {
		String answer = "";
		int[] month = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
		String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int temp = 0;
		for(int i = 0; i < a-1; i++) {
			temp += month[i];
		}temp += b-1;
		answer = week[temp % 7];
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_38 test = new Level1_38();
		int a = 1; // ¿ù 5
		int b = 7; // ÀÏ 24
		System.out.println(test.solution(a, b));
	}
}
