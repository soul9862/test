package Level1;

// 수박수박수박수박수박수?
public class Level1_28 {
	public String solution(int n) {
	      String answer = "";
	      int count = 0;
	      
	      while(count < n) {
	    	  if(count % 2 == 0) {
	    		  answer += "수";
	    	  }else {
	    		  answer += "박";
	    	  }
	    	  count++;
	      }
	      /* if문 대신 3항연산 사용
	       * result += i % 2 == 0 ? "수" : "박";
	       */
	      return answer;
	  }

	public static void main(String[] args) {
		Level1_28 test = new Level1_28();
		int n = 3;
		System.out.println(test.solution(n));
	}
}
