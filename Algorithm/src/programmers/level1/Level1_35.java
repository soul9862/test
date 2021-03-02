package Algorithm.src.programmers.level1;
// ���� ���ڴ� �Ⱦ�
public class Level1_35 {

	public int[] solution(int []arr) {
		int[] answer = {};
		int index = 1;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				index++;
			}
		}
		System.out.println("index = " + index);
		answer = new int[index];
		index = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				answer[index] = arr[i];
				index++;
			}
		}
		answer[answer.length-1] = arr[arr.length-1];
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Level1_35 test = new Level1_35();
		int[] arr = {1,1,0,3,3,0,1,1}; // {1, 0, 0, 0}, {4,4,4,3,3}, 
		test.solution(arr);
	}
}
