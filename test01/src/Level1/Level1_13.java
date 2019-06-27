package Level1;
//프로그래머스 2018 섬머코딩 예산
public class Level1_13 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		
		for(int i = 0; i < d.length; i++) {
			budget -= d[i];
			if(budget >= 0) {
				answer += 1;
			}else {
				break;
			}
			
		}
	    
		return answer;
	  }
	public static void main(String[] args) {
		Level1_13 test = new Level1_13();
		int[] d = new int[] {2,2,3,3};
		int budget = 10;
		
		System.out.println(test.solution(d, budget));
	}
}
