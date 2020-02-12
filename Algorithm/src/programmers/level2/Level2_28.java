package programmers.level2;

import java.util.HashMap;

// 위장
public class Level2_28 {
	public int solution(String[][] clothes) {
        int answer = 1;
        
        // map : 중복 키 판별 , value : 중복 넘버 증가
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < clothes.length; i++) {
        	
        	if(map.containsKey(clothes[i][1])) {
        		map.replace(clothes[i][1], map.get(clothes[i][1])+1);
        	}else {
        		map.put(clothes[i][1], 1);
        	}
        	
        }
        
        for(int value : map.values()) {
        	answer *= value+1;
        }
        
        answer -= 1;
        
        return answer;
    }
}
