package Level2;

import java.util.Arrays;

// 전화번호 목록
public class Level2_31 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++) {
        	if(phone_book[i+1].startsWith(phone_book[i])) {
        		answer = false;
        		break;
        	}
        }
        
        return answer;
    }
}
