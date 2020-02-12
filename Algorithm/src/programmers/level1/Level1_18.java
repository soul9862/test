package programmers.level1;


// ��� ���ϱ�
public class Level1_18 {

	public double solution(int[] arr) {
		double answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		answer /= arr.length;
		
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_18 test = new Level1_18();
		
		// �׽��� ��¹�
		int[] arr = {};
		
		test.solution(arr);
	}
}
