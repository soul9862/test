package kakao.first_2018;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2018년 카카오 오픈채팅방 문제
public class openChat {
	public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> tempMap = new HashMap<String, String>();
        String[] temp = {};
        int count = 0;
        
        for(int i = 0; i < record.length; i++) {
        	temp = new String[record[i].split(" ").length];
        	temp = record[i].split(" ");
        	if(temp.length == 3) {
        		tempMap.put(temp[1], temp[2]);
        	}
        	if(!temp[0].equals("Change")) {
        		count++;
        	}
        }
        
        answer = new String[count];
        count = 0;
        for(int i = 0; i < record.length; i++) {
        	temp = new String[record[i].split(" ").length];
        	temp = record[i].split(" ");
        	System.out.println(Arrays.toString(temp));
        	
        	if(temp[0].equals("Enter")) {
        		answer[count] = tempMap.get(temp[1]) + "님이 들어왔습니다.";
        		count++;
        	}else if(temp[0].equals("Leave")){
        		answer[count] = tempMap.get(temp[1]) + "님이 나갔습니다.";
        		count++;
        	}
        	
        }
        
        return answer;
    }
}
