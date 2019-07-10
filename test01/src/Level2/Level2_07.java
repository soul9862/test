package Level2;

// 예상 대진표
public class Level2_07 {
	// 8	4	7	3
	
	public int solution(int n, int a, int b)
	{
		int answer = 0;
		while(a != b) {
			if(a % 2 != 0) {
				a += 1;
				System.out.println("a = 홀수");
			}
			if(b % 2 != 0) {
				b += 1;
				System.out.println("b = 홀수");
			}
			a /= 2;
			b /= 2;
			answer++;
			System.out.println("라운드 업");
		}
		return answer;
	}
	public static void main(String[] args) {

	}
}
