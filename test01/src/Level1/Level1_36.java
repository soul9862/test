package Level1;

// 가운데 글자 가져오기
public class Level1_36 {
	public String solution(String s) {
	      String answer = "";
	      char[] temp = s.toCharArray();
	      if(s.length() % 2 != 0) {
	    	  answer += temp[temp.length/2];
	      }else {
	    	  answer += temp[temp.length/2-1];
	    	  answer +=	temp[temp.length/2];
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		Level1_36 test = new Level1_36();
		String s = "acsde";
		System.out.println(test.solution(s));
	}
}
