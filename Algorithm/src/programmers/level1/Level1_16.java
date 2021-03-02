package Algorithm.src.programmers.level1;
// ����� ����
public class Level1_16 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_16 test = new Level1_16();

		// ��¹� �׽���
		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};		
		int[][] testing = test.solution(arr1, arr2);
		System.out.println(testing.length);
		System.out.println(testing[0].length);
	}
}
