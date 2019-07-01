package Level1;

import java.util.Arrays;

// 정수 내림차순으로 배치하기
public class Level1_22 {

	public long solution(long n) {
		long answer = 0;
		String str = ""+n;
		String[] temp = new String[str.length()+1];
		temp = str.split("");
		Arrays.sort(temp);

		for(int i = 0; i < temp.length; i++) {
			answer += Integer.parseInt(temp[i])*Math.pow(10, i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_22 test = new Level1_22();
		long n = 873211;
		long answer = test.solution(n);
		System.out.println(answer);

	}
}
