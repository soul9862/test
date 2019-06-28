package Level1;


// 콜라츠 추측
public class Level1_19 {
	public int solution(int num) {
		int answer = 0;

		// 형변환 (int 범위 초과)
		long temp = num;

		// for구문 사용
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

		// while구문
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
