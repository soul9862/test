package programmers.level1;

// ���ڿ��� ������ �ٲٱ�
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


/* �˰��� ��� (����) : ���α׷��ӽ�(�͸� Ǯ��)
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
    //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
*/