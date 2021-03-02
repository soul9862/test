package Algorithm.src.programmers.level1;
import java.util.Arrays;

//���α׷��ӽ� ����
public class Level1_13 {
	
	  public int solution(int[] d, int budget) {
	      int answer = 0;
	      
	      Arrays.sort(d);
	      for(int i = 0; i< d.length; i++) {
	    	  budget -= d[i];
	    	  if(budget >= 0){
	    		  answer += 1;
	    	  }else {
	    		  break;
	    	  }
	      }
	      return answer;
	  }
	
	public static void main(String[] args) {
		Level1_13 test = new Level1_13();
		int[] d = new int[]{100,2,2,1,1,5};
		int budget = 300;
		System.out.println(test.solution(d, budget));
	} 
	
}
