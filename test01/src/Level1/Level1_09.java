package Level1;

public class Level1_09 {

	public String findKim(String[] seoul){
		//x에 김서방의 위치를 저장하세요.
		String answer = "";
		int index = 0;

		for(int i = 0; i < seoul.length; i++) {
			answer = seoul[i];
			if(answer.equals("Kim")) {
				index = i;
			}
		}
		answer = "김서방은 "+ index + "에 있다";
		
		return answer;
	}

	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		Level1_09 kim = new Level1_09();
		String[] names = {"Jane", "Kim"};
		System.out.println(kim.findKim(names));
	}
}
