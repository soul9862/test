package Algorithm.src.programmers.level2;


import java.util.Arrays;

// �ִ񰪰� �ּڰ�
public class Level2_17 {
	 public String solution(String s) {
	      String answer = "";
	      String[] temp = new String[s.split(" ").length];
	      temp = s.split(" ");
	      int[] test = new int[temp.length];
	      
	      for(int i = 0; i < temp.length; i++) {
	    	  test[i] = Integer.parseInt(temp[i]); 
	      }
	      Arrays.sort(test);
	      
	      answer = test[0] + " " + test[test.length-1];
	      
	      return answer;
	  }
}
