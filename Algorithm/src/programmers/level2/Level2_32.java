package programmers.level2;

// 조이스틱
public class Level2_32 {
	public int solution(String name) {
		int answer = 0;
		
		char temp;
		int cursor = name.length() - 1;
		for(int i = 0; i < name.length(); i++) {
			
			temp = name.charAt(i);
			
			if((int) temp == 65) {
				int index = i+1;
				int count = 0;
				
				while(index < name.length() && (int) name.charAt(index) == 65) {
					index++;
					count++;
				}
				if(cursor > (i - 1) * 2 + (name.length() - 1 - i - count))
					cursor = (i - 1) * 2 + (name.length() - 1 - i - count);
				
			}else {
				answer += Math.min((int) temp - 65, 91 - (int) temp);
			}
			
			System.out.println("temp : " + (int) temp);
		}
		System.out.println("위 아래 이동 : " + answer);
		System.out.println("좌우 이동 : " + cursor);
		answer += cursor;
		return answer;
	}
}
