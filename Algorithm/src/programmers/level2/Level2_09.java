package programmers.level2;

// ������ ���� �̵�
public class Level2_09 {
//	5	6	5000	2	3	4	7	
//	2	2	5		1	2	1	3
	
	 public int solution(int n) {
	        int ans = 0;
	        while(n >= 1) {
	        	if(n % 2 == 0) {
	        		n /= 2;
	        	}else {
	        		n /= 2;
	        		ans++;
	        	}
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		
	}
}
