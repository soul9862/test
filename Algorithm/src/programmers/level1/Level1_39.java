package Algorithm.src.programmers.level1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// ü����
public class Level1_39 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int temp = 0;
		List<Integer> lostArr = Arrays.stream(lost).boxed().collect(Collectors.toList());
		List<Integer> reserveArr = Arrays.stream(reserve).boxed().collect(Collectors.toList());

		for(int i = 0; i < reserveArr.size(); i++) {
			temp = reserveArr.get(i);
			for(int j = 0; j < lostArr.size(); j++) {
				if(temp == lostArr.get(j)) {
					lostArr.remove(j);
					reserveArr.remove(i);
					i -= 1;
					j -= 1;
					break;
				}
			}
		}

		for(int i = 0; i < reserveArr.size(); i++) {
			temp = reserveArr.get(i);
			for(int j = 0; j < lostArr.size(); j++) {
				if((temp+1) == lostArr.get(j) || (temp-1) == lostArr.get(j)) {
					lostArr.remove(j);
					reserveArr.remove(i);
					i -= 1;
					j -= 1;
					break;
				}
			}
		}
		answer = n - lostArr.size();
		
		return answer;

	}
	public static void main(String[] args) {
		Level1_39 test = new Level1_39();
		// 5	5	3
		int n = 3;
		// {2, 4}	{2, 4}	{3}
		int[] lost = {1,2};
		// {1, 3, 5}	{3}	{1}
		int[] reserve = {2,3};
		System.out.println(test.solution(n, lost, reserve));
		//		answer = 5	4	2


		// �׽�Ʈ ���̽�
		//		n               : 3
		//		lost           : [2,3]
		//		reserve    : [1]
		//		return      : 2
		//
		//		n               :18
		//		lost           :[7,8,11,12]
		//		reserve    : [1,6,8,10]
		//		return      : 17
		//
		//
		//		n               : 24
		//		lost           :[12, 13, 16, 17, 19, 20, 21, 22]
		//		reserve    : [1,22, 16, 18, 9, 10]
		//		return      : 19

		// ���̽� 12��
		//n = 3, lost = [1,2], reserve = [2,3] return =  2

	}
}
