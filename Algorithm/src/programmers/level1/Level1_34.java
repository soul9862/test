package programmers.level1;

import java.util.Arrays;

// ������ �������� ���� �迭
public class Level1_34 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int[] temp = {};
		int length = arr.length;
		temp = new int[length];
		int index = 0;
		
		for(int i = 0; i < length; i++) {
			if(arr[i] % divisor == 0) {
				temp[index] = arr[i];
				index++;
			}
		}
		if(index == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[index];
			for(int i = 0; i < index; i++) {
				answer[i] = temp[i];
			}
			Arrays.sort(answer);
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		Level1_34 test = new Level1_34();
		
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		test.solution(arr, divisor);
	}
}
