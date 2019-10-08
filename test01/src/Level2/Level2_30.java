package Level2;

import java.util.Arrays;

public class Level2_30 {
	public int solution(int[] citations) {
        int answer = 0;
        answer = citations.length;
        Arrays.sort(citations);
        
        answer /= 2;
        while(true) {
        	
        	if(citations[answer] >= answer && 
        			citations[answer] <= (citations.length - answer)) {
        		answer = citations.length - answer - 1;
            	break;        		
        	}
        	answer--;
        	if(answer == 0) {
        		answer = citations.length - 1;
        		break;
        	}
        }
        answer++;
        return answer;
    }
}
