package programmers.level2;

import java.util.Stack;

// 프로그래머스 Lv2 숫자야구(완전탐색)
public class Level2_29 {
	public int solution(int[][] baseball) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();

		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				for(int k = 1; k < 10; k++) {
					if(i != j && j != k && i != k) {
						stack.push(i * 100 + j * 10 + k);
					}
				}
			}
		}
		while(!stack.isEmpty()) {
			int num = stack.pop();

			for(int i = 0; i < baseball.length; i++) {
				if(baseball[i][1] != strike(num, baseball[i][0])
						|| baseball[i][2] != ball(num, baseball[i][0])) {
					break;
				}else {
					if(i == baseball.length-1) {
						answer++;
//						System.out.println("num : " + num);
					}
				}
			}

		}


		return answer;
	}
	public static int strike(int num, int target) {
		int count = 0;

		for(int i = 0; i < 3; i++) {
			if((num / (int)Math.pow(10, i)) % 10 == (target / (int)Math.pow(10, i)) % 10) {
				count++;
			}
		}
//		System.out.println("num : " + num + " target : " + target + " strike : " + count);
		return count;
	}

	public static int ball(int num, int target) {
		int count = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i != j && num / (int)Math.pow(10, i) % 10 == target / (int)Math.pow(10, j) % 10)
					count++;
			}
		}
//		System.out.println("num : " + num + " target : " + target + " ball : " + count);
		return count;
	}
}
