package programmers.level1;

import java.util.Arrays;

// ���ǰ��
public class Level1_41 {
	//	1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	//	2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	//	3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	// index
	// 1�� : 5 2�� : 8 3�� : 10
	// answers : 5?

	public int[] solution(int[] answers) {
		int[] answer = {};
		int length = answers.length;
		int[] count = new int[3];
		int[] arr = new int[3];
		
		// 1, 2, 3�� ������ ���� ����
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		// ���� ���� �� counting
		for(int i = 0; i < length; i++) {
			if(answers[i] == num1[i % 5]) {
				count[0]++;
			}
			if(answers[i] == num2[i % 8]) {
				count[1]++;
			}
			if(answers[i] == num3[i % 10]) {
				count[2]++;
			}
		}
		arr = Arrays.copyOf(count, 3);
		Arrays.sort(count);
		length = 0;
		// answer �迭 ũ��
		for(int i = 0; i < count.length; i++) {
			if(count[count.length-1] == arr[i]) {
				length++;
			}
		}
		answer = new int[length];
		int index = 0;
		// answer �Է�
		for(int i = 0; i < length; i++) {
			for(int j = index; j < arr.length; j++) {
				if(count[count.length-1] == arr[j]) {
					answer[i] = j+1;
					index = j+1;
					break;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {

	}
}
