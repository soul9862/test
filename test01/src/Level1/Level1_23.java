package Level1;

import java.util.Arrays;
import java.util.Collections;

// 자연수 뒤집어 배열로 만들기
public class Level1_23 {
	public int[] solution(long n) {
		int[] answer = {};
		String str = "" + n;
		String[] temp = {};
		answer = new int[str.length()];
		temp = new String[str.length()];
		temp = str.split("");
		Arrays.sort(temp, Collections.reverseOrder());
		//System.out.println(str);
		for(int i = 0; i < temp.length; i++) {
			answer[i] = Integer.parseInt(temp[i]);
			//System.out.print(answer[i]);
			
		}
		//System.out.println();
		//System.out.println(temp.length);
		//System.out.println(answer.length);
		
		
		return answer;
	}
	public static void main(String[] args) {
		Level1_23 test = new Level1_23();
		
		long n = 804043101;
		test.solution(n);
	}
}
