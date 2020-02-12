package programmers.level2;

// N���� �ּҰ����
public class Level2_12 {
	public int solution(int[] arr) {
		int answer = 0;
		int big;
		int small;
		int r;

		for(int i = 0; i < arr.length-1; i++) {
			big = Math.max(arr[i], arr[i+1]);
			small = Math.min(arr[i], arr[i+1]);
			while(true) {
				r = big%small;
				big = small;
				small = r;


				if(r == 0) {
					arr[i+1] = big*arr[i]/big*arr[i+1]/big;
					break;
				}
			}
		}
		answer = arr[arr.length-1];
		return answer;
	}

}
