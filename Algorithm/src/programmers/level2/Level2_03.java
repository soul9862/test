package Algorithm.src.programmers.level2;


public class Level2_03 {
	public int collatz(int num) {
		int answer = 0;
		long temp = num;

		while(true) {
			
			if(temp % 2 == 0) {
				temp = temp / 2;
			}else {
				temp = temp * 3 + 1;
			}
			answer++;
			
			if(answer == 500) {
				answer = -1;
				break;
			}else if(temp == 1) break;
		}
		
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Level2_03 c = new Level2_03();
		int ex = 626331;
		System.out.println(c.collatz(ex));
	}
}
