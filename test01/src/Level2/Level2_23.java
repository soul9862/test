package Level2;

// 가장 큰 정사각형 찾기
public class Level2_23 {
	public int solution(int [][]board)
    {
        int answer = 0;
        for(int i = 1; i < board.length; i++) {
        	for(int j = 1; j < board[i].length; j++) {
        		if(board[i-1][j-1] >= 1 &&
        				board[i][j-1] >= 1 && 
        				board[i-1][j] >= 1 &&
        				board[i][j] == 1) {
        			if(board[i-1][j-1] == board[i][j-1] && board[i-1][j-1] == board[i-1][j]) {
        				board[i][j] = (Math.max(Math.max(board[i-1][j-1], 
            					board[i][j-1]), 
            					board[i-1][j]) + 1);
        			}else {
        				board[i][j] = Math.max(Math.max(board[i-1][j-1], 
            					board[i][j-1]), 
            					board[i-1][j]);
        			}
        			
        			answer = board[i][j];
        		}
        	}
        }
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[i].length; j++) {
        		System.out.print(board[i][j] + " ");
        	}System.out.println();
        }
        
        answer = (int) Math.pow(answer, 2);
        return answer;
    }
}
