package Level1;

import java.util.ArrayList;

// 소수찾기
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

		// 에라토스체 (List 사용 bool 타입)
//		ArrayList<Boolean> primeList;
//
//		// n+1만큼 할당
//		primeList = new ArrayList<Boolean>(n+1);
//		// 0번째와 1번째를 소수 아님으로 처리
//		primeList.add(false);
//		primeList.add(false);
//		// 2~ n 까지 소수로 설정
//		for(int i=2; i<=n; i++ )
//			primeList.add(i, true);
//
//		// 2 부터  ~ i*i <= n
//		// 각각의 배수들을 지워간다.
//		for(int i=2; (i*i)<=n; i++){
//			if(primeList.get(i)){
//				for(int j = i*2; j<=n; j+=i)
//					primeList.set(j, false);
//			}
//		}
//		for(int i = 0; i <= n; i++) {
//			if(primeList.get(i)) answer++;
//		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Level1_37 test = new Level1_37();
		int n = 1000000;
		System.out.println(test.solution(n));
		
		long finish = System.currentTimeMillis();
		
		// 실행 시간 테스트
		long time = finish - start;
		
		System.out.println("걸린 시간: " + time + " 밀리초");
	}
}
