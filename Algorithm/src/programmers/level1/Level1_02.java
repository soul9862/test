package programmers.level1;

class SumMatrix {
	int[][] sumMatrix(int n, int m, int[][] A, int[][] B) {
		int[][] answer = new int [n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}
		
		

		return answer;
	}
}

public class Level1_02 {
	public static void main(String[] args) {
		
		SumMatrix c = new SumMatrix();
		int n = 2;
		int m = 2;
		int[][] A = { { 1, 2 }, { 2, 3 } };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		int[][] answer = c.sumMatrix(n, m,A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("�¾ҽ��ϴ�. ������ ���� ������");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. �����ϴ°� ���ھ��");
		}

	}
}

