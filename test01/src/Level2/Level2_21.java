package Level2;

// 다음 큰 숫자
public class Level2_21 {
	public int solution(int n) {
		int answer = n;
		int count = 0;
		String temp = Integer.toBinaryString(n);
		System.out.println(temp);
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == '1') count++;
		}
		while(n != count) {
			n = 0;
			answer++;
			temp = Integer.toBinaryString(answer);
			for(int i = 0; i < temp.length(); i++) {
				if(temp.charAt(i) == '1') n++;
			}
			if(n == count) {
				break;
			}
		}
		return answer;
	}
}
