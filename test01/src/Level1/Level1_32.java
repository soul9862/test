package Level1;

import java.util.Arrays;

public class Level1_32 {
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		answer = new String[strings.length];
		String[] temp = {};
		temp = new String[answer.length];
		int length = strings.length;
		
		// 해당 인덱스 이상 자르기
		for(int i = 0; i < strings.length; i++) {
			temp[i] = strings[i].substring(n);
		}

		Arrays.sort(temp);
		Arrays.sort(strings);
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < length; j++) {
				if(temp[i].equals(strings[j].substring(n))) {
					answer[i] = strings[j];
					strings[j] = "";
					length--;
					break;
				}
			}
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_32 test = new Level1_32();
		String[] strings = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		int n = 2;
		test.solution(strings, n);
	}
}
