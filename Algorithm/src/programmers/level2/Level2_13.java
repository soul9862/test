package programmers.level2;

// JadenCase ���ڿ� �����
public class Level2_13 {

	public String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		char[] temp = s.toCharArray();
		if(temp[0] >= 97 && temp[0] <= 122) {
			temp[0] -= 32;
		}
		for(int i = 1; i < temp.length; i++) {
			if(temp[i-1] == 32 && temp[i] >= 97 && temp[i] <= 122) {
				temp[i] -= 32;
			}
		}
		for(int i = 0; i < temp.length; i++) {
			answer += temp[i];
		}
		
		return answer;
	}

}
