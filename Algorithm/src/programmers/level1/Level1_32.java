package programmers.level1;

import java.util.Arrays;

// ���ڿ� �� ������� �����ϱ�
public class Level1_32 {
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		answer = new String[strings.length];
		char[] temp = new char[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			temp[i] = strings[i].charAt(n);
		}
		Arrays.sort(temp);
		// �׽�Ʈ ���
		System.out.println(Arrays.toString(temp));
//		System.out.println(Arrays.toString(strings));
		
		for(int i = 0; i < answer.length; i++) {
			Arrays.sort(strings, i, answer.length);
			for(int j = i ; j < answer.length; j++) {
				if(temp[i] == strings[j].charAt(n)) {
					answer[i] = strings[j];
					strings[j] = strings[i];
					strings[i] = answer[i];
					// System.out.println(i+ " ��° = " + Arrays.toString(strings));
					break;
				}
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_32 test = new Level1_32();
		String[] strings = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		// "sun", "bed", "car" // 1
		int n = 2;
		System.out.println(Arrays.toString(test.solution(strings, n)));
	}
}
