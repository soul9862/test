package Algorithm.src.programmers.level1;
// �ִ����� �ּҰ����
import java.util.Arrays;

class TryHelloWorld {
	public int[] gcdlcm(int n, int m) {
		int[] answer = new int[2];
		int big;
		int small;
		int r;

		if(n > m) {
			big = n;
			small = m;
		}else {
			big = m;
			small = n;
		}

		while(true) {
			r = big%small;
			big = small;
			small = r;
			
			
			if(r == 0) {
				answer[0] = big;
				answer[1] = big*n/big*m/big;
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
