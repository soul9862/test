package Algorithm.src.programmers.level2;


// �Ǻ���ġ ��
public class Level2_15 {

	public int solution(int n) {
	      int answer = 1;
	      int[] temp = {};
	      temp = new int[2];
	      
	      for(int i = 2; i <= n; i++) {
	    	temp[0] = temp[1] % 1234567;
	    	temp[1] = answer % 1234567;
	    	answer = temp[0] + temp[1] ;  
	      }
	      answer = answer % 1234567;
	      
	      return answer;
	  }
}
