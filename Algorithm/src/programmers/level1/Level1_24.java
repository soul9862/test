package Algorithm.src.programmers.level1;
// �ڸ��� ���ϱ�
public class Level1_24 {
	public int solution(int n) {
		int answer = 0;
		int len = Integer.toString(n).length();
		int cnt = 0;
		while(cnt < len) {
			answer += n % 10;
			n /= 10;
			cnt++;
		}
		return answer;
	}


	public static void main(String[] args) {
		Level1_24 test = new Level1_24();
		int n = 987;
		System.out.println(test.solution(n));
	}
}
