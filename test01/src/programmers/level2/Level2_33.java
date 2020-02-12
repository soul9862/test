package Level2;

public class Level2_33 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
        	for(int j = i; j < prices.length; j++) {
        		if(prices[i] > prices[j]) {
        			answer[i] = j-i;
        			break;
        		}else if(j == prices.length-1) {
        			answer[i] = j-i;
        		}
        	}
        }
        
        return answer;
    }
}
