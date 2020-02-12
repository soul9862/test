package programmers.level1;

// �� ���� ������ ��
public class Level1_33 {
	public long solution(int a, int b) {
		long answer = 0;
		if(b > a) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		}else if(a > b) {
			for(int i = b; i <= a; i++) {
				answer += i;
			}
		}else {
			answer = a;
		}
		return answer;
	}

	public static void main(String[] args) {
		Level1_33 test = new Level1_33();
		int a = 0;
		int b = 0;
		test.solution(a, b);
	}
}
