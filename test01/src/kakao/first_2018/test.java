package kakao.first_2018;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		openChat test = new openChat();
		String[] record = {"Enter uid1234 Muzi", 
							"Enter uid4567 Prodo",
							"Leave uid1234",
							"Enter uid1234 Prodo",
							"Change uid4567 Ryan"};
		String[] answer = test.solution(record);
		
		System.out.println(Arrays.toString(answer));
	}
}
