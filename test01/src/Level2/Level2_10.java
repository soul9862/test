package Level2;

import java.util.Arrays;

// 소수 만들기
public class Level2_10 {
	//	[1,2,3,4]	[1,2,7,6,4]
	//	1			4
	public int solution(int[] nums) {
		int answer = 0;
		int n = 0;
		// 정렬
		Arrays.sort(nums);
		// 3중문 3개 항목 추출
		for(int i = 0; i < nums.length-2; i++) {
			for(int j = i+1; j < nums.length-1; j++) {
				for(int k = j+1; k < nums.length; k++) {
					n = nums[i] + nums[j] + nums[k];
					if(primeNumber(n) == true) answer++;
				}
			}
		}

		return answer;
	}
	// 소수 판별
	public static boolean primeNumber(int n) {
		boolean answer = false;

		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				answer = false;
				break;
			}else {
				answer = true;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {

	}
}
