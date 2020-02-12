package Level1;

//문자열 내림차순으로 배치하기
import java.util.Arrays;
public class Level1_30 {
	public String solution(String s) {
	      String answer = "";
	      char[] temp = s.toCharArray();
	      Arrays.sort(temp);
	      for(int i = (temp.length-1); i >= 0; i--) {
	    	  answer += temp[i];
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		Level1_30 test = new Level1_30();
		String s = "Zbcdefg";
		System.out.println(test.solution(s));
	}
}
