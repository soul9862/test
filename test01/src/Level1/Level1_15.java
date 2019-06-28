package Level1;

//x만큼 간격이 있는 n개의 숫자
public class Level1_15 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		for(int i = 1; i <= n; i++) {
			answer[i-1] = (long)x*i; // 형변환 필
		} 
		return answer;
	}

	public static void main(String[] args) {
		Level1_15 test = new Level1_15();

		System.out.println(test.solution(2, 4));
	}
}
