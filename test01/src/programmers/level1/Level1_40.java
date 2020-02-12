package Level1;

import java.util.Arrays;

// K¹øÂ°¼ö
public class Level1_40 {
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = {};
	        int[] temp = {};
	        int i, j, k;
	        answer = new int[commands.length];
	        
	        for(int m = 0; m < commands.length; m++) {
	        	i = commands[m][0];
	        	j = commands[m][1];
	        	k = commands[m][2];
	        	temp = new int[j-i+1];
	        	for(int n = 0; n < j-i+1; n++) {
	        		temp[n] = array[n+i-1];
	        	}
	        	Arrays.sort(temp);
	        	answer[m] = temp[k-1];
	        }
	        for(i = 0; i < answer.length; i++) {
	        	System.out.println(answer[i]);
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		Level1_40 test = new Level1_40();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		test.solution(array, commands);
		
		// arr = [1, 5, 2, 6, 3, 7, 4]
		// com = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
		// ret = [5, 6, 3]
	}
}
