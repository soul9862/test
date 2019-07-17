package Level2;

// 가장 큰 정사각형 찾기
public class Level2_23 {
	public int solution(int [][]board)
    {
        int answer = 1;
        for(int i = 1; i < board.length; i++) {
        	for(int j = 1; j < board[i].length; j++) {
        		if(board[i][j] == 1) {
        			board[i][j] = Math.min(Math.min(board[i-1][j-1], board[i][j-1]), board[i-1][j])+1;
        		}
        	}
        }
        
        for(int i = 1; i < board.length; i++) {
        	for(int j = 1; j < board[i].length; j++) {
        		answer = Math.max(answer, board[i][j]);
        	}
        }
        
        answer = (int) Math.pow(answer, 2);
        return answer;
    }
}
