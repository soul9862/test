package programmers.level1;


// �ݶ��� ����
public class Level1_19 {
	public int solution(int num) {
		int answer = 0;

		// ����ȯ (int ���� �ʰ�)
		long temp = num;

		// for���� ���
		/*if(temp != 1) {
	    	  for(int i = 0; i < 500; i++) {
		    	  if(temp % 2 == 0) {
		    		  temp /= 2;
		    	  }else {
		    		  temp = temp*3 + 1;
		    	  }
		    	  answer ++;
		    	  if(temp == 1) {
		    		  break;
		    	  }
		      }
	      }else {
	    	  answer = 0;
	      }

	      if(answer == 500) {
	    	  answer = -1;
	      }
		 */

		// while����
		if(temp != 1) {
			while(true) {

				if(temp % 2 == 0) {
					temp = temp / 2;
				}else {
					temp = temp * 3 + 1;
				}
				answer++;

				if(answer == 500) {
					answer = -1;
					break;
				}else if(temp == 1) {
					break;
				}

			}	    	  
		}else if(temp == 1) {
			answer = 0;
		}


		return answer;

	}

	public static void main(String[] args) {
		Level1_19 test = new Level1_19();

		int num = 1;
		System.out.println(test.solution(num));
	}
}
