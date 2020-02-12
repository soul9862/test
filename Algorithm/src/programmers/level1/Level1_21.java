package programmers.level1;

// ���� ������ �Ǻ�
public class Level1_21 {

	public long solution(long n) {
		long answer = 0;
		double sqrt = Math.sqrt(n);
		
		if(sqrt == Math.round(sqrt)) {
			answer = (long) Math.pow(sqrt+1, 2);
		}else {
			answer = -1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_21 test = new Level1_21();
		//�׽��� ���
		long n = 121;
		long result = test.solution(n);
		System.out.println(result);
		
	}
}
