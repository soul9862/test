package programmers.level2;

import java.util.Arrays;

// �ּڰ� �����
public class Level2_16 {

	public int solution(int []A, int []B)
	{
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		int j = B.length-1;
		for(int i = 0; i < A.length; i++) {
			answer += A[i] * B[j];
			j--;
		}
		
		return answer;
	}
}
