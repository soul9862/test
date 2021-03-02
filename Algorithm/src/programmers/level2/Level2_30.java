package Algorithm.src.programmers.level2;


import java.util.Arrays;

// h-index
public class Level2_30 {
	public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i = 1; i <= citations.length; i++) {
        	int min = Math.min(i, citations[citations.length - i]);
        	if(min > answer) answer = min;
        	else break;
        }
        return answer;
    }
}
