package Algorithm.src.programmers.level1;
// ���ڿ� �� p�� y�� ����
public class Level1_31 {

	boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        s = s.toLowerCase();
        char[] temp = s.toCharArray();
        for(int i = 0; i < temp.length; i++) {
        	if(temp[i] == 'p') {
        		countP++;
        	}else if(temp[i] == 'y'){
        		countY++;
        	}
        }
        if(countP != countY) {
        	answer = false;
        }
        return answer;
    }
	public static void main(String[] args) {
		Level1_31 test = new Level1_31();
		String s = "abd";
		System.out.println(test.solution(s));
	}
}
