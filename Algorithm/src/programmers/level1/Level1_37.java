package programmers.level1;

import java.util.ArrayList;

// �Ҽ�ã��
public class Level1_37 {
	public int solution(int n) {
		int answer = 0;
		int[] num = new int[n+1];
		
		for(int i = 2; i <= n; i++) {
			num[i] = i;
		}
		for(int i = 2; (i*i) <= n; i++) {
			if(num[i] == 0) continue;
			
			for(int j = i*2; j <= n; j += i) {
				num[j] = 0;
			}
		}
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) answer++;
		}

		// �����佺ü (List ��� bool Ÿ��)
//		ArrayList<Boolean> primeList;
//
//		// n+1��ŭ �Ҵ�
//		primeList = new ArrayList<Boolean>(n+1);
//		// 0��°�� 1��°�� �Ҽ� �ƴ����� ó��
//		primeList.add(true);
//		primeList.add(true);
//		// 2~ n ���� �Ҽ��� ����
//		for(int i=2; i<=n; i++ )
//			primeList.add(i, false);
//
//		// 2 ����  ~ i*i <= n
//		// ������ ������� ��������.
//		for(int i=2; (i*i)<=n; i++){
//			if(primeList.get(i)){
//				for(int j = i*2; j<=n; j+=i)
//					primeList.set(j, true);
//			}
//		}
//		for(int i = 0; i <= n; i++) {
//			if(primeList.get(i) == false) answer++;
//		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Level1_37 test = new Level1_37();
		int n = 1000000;
		System.out.println(test.solution(n));
		
		long finish = System.currentTimeMillis();
		
		// ���� �ð� �׽�Ʈ
		long time = finish - start;
		
		System.out.println("�ɸ� �ð�: " + time + " �и���");
	}
}
