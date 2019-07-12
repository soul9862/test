package Level2;

// 숫자의 표현
public class Level2_18 {
	public int solution(int n) {
	      int answer = 0;
	      int temp = 0;
	      for(int i = 1; i <= n; i++) {
	    	  temp = 0;
	    	  for(int j = i; j <= n; j++) {
	    		  temp += j;
		    	  if(temp > n) {
		    		  break;
		    	  }else if(temp == n) {
		    		  answer++;
		    		  break;
		    	  }
	    	  }
	      }
	      
	      return answer;
	  }
}
