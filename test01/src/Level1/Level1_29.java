package Level1;

// 문자열 다루기 기본
public class Level1_29 {

	public boolean solution(String s) {
		boolean answer = true;
		char[]temp = s.toCharArray();
		if(s.length() == 4 || s.length() ==6) {

			for(int i = 0; i < temp.length; i++) {
				if((int)temp[i] >= 48 && (int)temp[i] <=57) {
					continue;
				}else {
					answer = false;
					break;
				}
			}

		}else answer = false;
		return answer;
	}

	public static void main(String[] args) {
		Level1_29 test = new Level1_29();
		String s = "123456z";
		System.out.println(test.solution(s));
	}
}
