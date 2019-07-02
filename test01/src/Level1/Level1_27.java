package Level1;

// 문자열을 정수로 바꾸기
public class Level1_27 {
	public int solution(String s) {
	      int answer = 0;
	      answer = Integer.parseInt(s);
	      
	      return answer;
	  }
	
	public static void main(String[] args) {
		Level1_27 test = new Level1_27();
		String s = "-1563";
		System.out.println(test.solution(s));
	}
}


/* 알고리즘 사용 (참조) : 프로그래머스(익명 풀이)
public class StrToInt {
    public int getStrToInt(String str) {
            boolean Sign = true;
            int result = 0;

      for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '-')
                    Sign = false;
                else if(ch !='+')
                    result = result * 10 + (ch - '0');
            }
            return Sign?1:-1 * result;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
*/