package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// 짝지어 제거하기
public class Level2_11 {
	public int solution(String s)
	{
		int answer = 0;
		// 단순비교(런타임 오류)
//		for(int i = 0; i < s.length()-1; i++) {
//			if(s.charAt(i) == s.charAt(i+1)) {
//					s = s.substring(0, i) 
//							+ s.substring(i+2, s.length());
//					if(i > 1) {
//						i = i -2;
//					}else {
//						i = -1;
//					}
//					
//					System.out.println(s + " i = " + i);
//			}
//		}
//		if(s.length() == 0) {
//			answer = 1;
//		}

		
		// 스택
		Stack<Character> stack = new Stack<Character>();
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(!stack.isEmpty() && stack.peek() == ch[i]) {
				stack.pop();
			}else {
				stack.push(ch[i]);
			}
		}
		if(stack.isEmpty()) {
			answer = 1;
		}
		
		return answer;
	}


}
