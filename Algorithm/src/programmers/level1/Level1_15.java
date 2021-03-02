package Algorithm.src.programmers.level1;
//x��ŭ ������ �ִ� n���� ����
public class Level1_15 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		for(int i = 1; i <= n; i++) {
			answer[i-1] = (long)x*i; // ����ȯ ��
		} 
		return answer;
	}

	public static void main(String[] args) {
		Level1_15 test = new Level1_15();

		System.out.println(test.solution(2, 4));
	}
}
