package Level1;

class sumDivisor{
	public int sumDivisor(int num) {
		int answer = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				answer += i;
			}
		}
		
		return answer;
	}
}

public class Level1_04 {
	public static void main(String[] args) {
		sumDivisor c = new sumDivisor();
		
		int num = 5;
		
		System.out.println(c.sumDivisor(num));
	}
}
