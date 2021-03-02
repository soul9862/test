package Algorithm.src.programmers.level2;


// ( = 40, ) = 41
// �ùٸ� ��ȣ
public class Level2_22 {
	boolean solution(String s) {
		boolean answer = true;
		int x = 0;
		int y = 0;
		
		// x, y�� count �ϳ��� ǥ�� ����
		
		if(s.charAt(0) == ')') answer = false;
		else {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(') x++;
				else if(s.charAt(i) == ')') y++;
				
				if(x < y) answer = false;
			}
			if(x != y) answer = false;
		}
		
		return answer;
	}
}
