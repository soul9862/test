package Level1;

import java.util.Arrays;

class TryHelloWorld {
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		answer[0] = 1;
		answer[1] = 1;
		int big;
		int small;
		int r;

		if(a > b) {
			big = a;
			small = b;
		}else {
			big = b;
			small = a;
		}

		while(true) {
			r = big%small;
			big = small;
			small = r;
			
			
			if(r == 0) {
				answer[0] = big;
				answer[1] = big*a/big*b/big;
				break;
			}
		}
		
		return answer;
	}

}

public class Level1_01 {
	public static void main(String[] args) {
		TryHelloWorld c = new TryHelloWorld();
		System.out.println(Arrays.toString(c.gcdlcm(3, 15)));
	}
}
