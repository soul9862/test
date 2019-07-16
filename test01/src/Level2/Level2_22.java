package Level2;

// ( = 40, ) = 41
// 올바른 괄호
public class Level2_22 {
	boolean solution(String s) {
		boolean answer = true;
		int x = 0;
		int y = 0;
		
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
