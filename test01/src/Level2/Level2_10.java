package Level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 소수 만들기
public class Level2_10 {
	//	[1,2,3,4]	[1,2,7,6,4]
	//	1			4
	public int solution(int[] nums) {
		int answer = 0;
		Arrays.sort(nums);
		int n = nums[nums.length-1] 
				+ nums[nums.length-2] 
						+ nums[nums.length-3];
		eratos(n);

		return answer;
	}
	public static List<Integer> eratos(int n) {
		int[] num = new int[n+1];
		int count = 0;

		for(int i = 2; i <= n; i++) {
			num[i] = i;
		}
		for(int i = 2; (i*i) <= n; i++) {
			if(num[i] == 0) continue;

			for(int j = i*2; j <= n; j += i) {
				num[j] = 0;
			}
		}
		List<Integer> intArr = Arrays.stream(num).boxed().collect(Collectors.toList());
		return intArr;
	}
	public static void main(String[] args) {

	}
}
