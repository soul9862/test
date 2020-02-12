package programmers.level2;

import java.util.Arrays;

// 구명보트
public class Level2_27 {
	
	// {70, 50, 80, 50} : 100 : 3
	// {70, 80, 50} : 100 : 3
	public int solution(int[] people, int limit) {
        int answer = 0;
        int temp = 0;
        int i = 0;
        int j = people.length-1;
        
        Arrays.sort(people);
        
        while(true) {
        	temp = people[j];
        	temp += people[i];
        	
        	if(temp <= limit) {
        		temp = 0;
        		i++;
        		j--;
        		answer++;
        	}else {
        		temp = 0;
        		j--;
        		answer++;
        	}
        	
        	
        	if(i > j) {
        		break;
        	}else if(i == j) {
        		answer++;
        		break;
        	}
        }
        
        return answer;
    }
}
