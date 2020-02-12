package Level1;

// 정수 제곱근 판별
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
		//테스팅 출력
		long n = 121;
		long result = test.solution(n);
		System.out.println(result);
		
	}
}
