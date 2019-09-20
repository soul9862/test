package Level2;

import java.util.Arrays;

public class Level2_30 {
	public int solution(int[] citations) {
        int answer = 0;
        answer = (citations.length-1) / 2;
        Arrays.sort(citations);
        
        // 정렬 확인
        for(int i = 0; i < citations.length; i++) {
        	System.out.println(citations[i]);
        }
        
        while(true) {
        	int temp = citations.length-answer + 1;
        	
        	for(int i = temp-1; i < citations.length; i++) {
        		if(citations[i] >= answer) {
        			temp = citations.length-i + 1;
        			break;
        		}
        	}
        	
        	answer++;
        	
        	if(answer == temp) break;
        }
        
        return answer;
    }
}
