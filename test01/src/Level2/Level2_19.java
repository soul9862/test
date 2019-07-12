package Level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

// 포켓몬
public class Level2_19 {
	public int solution(int[] nums) {
		int answer = 0;
		int n = nums.length/2;

		List<Integer> intArr = Arrays.stream(nums).boxed().collect(Collectors.toList());

		for(int i = 0; i < intArr.size()-1; i++) {
			for(int j = i+1; j < intArr.size(); j++) {
				if(intArr.get(i) == intArr.get(j)) {
					System.out.println(intArr.get(i) + "  " + intArr.get(j));
					intArr.remove(j);
					j = i;
				}
			}
		}

		System.out.println("\n배열 크기 = "+ intArr.size());
		System.out.println("뽑을 개수 : " + n);
		answer = intArr.size() > n ? n : intArr.size();

		return answer;


//		HashSet<Integer> set = new HashSet<>();
//		int length = nums.length;
//		int pocketmon = length/2;
//		​
//		for (int i=0; i<length; i++){
//			set.add(nums[i]);
//		}
//
//		int size = set.size();
//		if(size > pocketmon){
//			return pocketmon;
//		}
//	       return size;
	}
}
