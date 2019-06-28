package Level1;

// 핸드폰 번호 가리기
public class Level1_17 {
	public String solution(String phone_number) {
		String answer = "";
		//문자열 자르기, 배열 저장
		String[] temp = phone_number.split("");
		
		//문자열 배열 뒷 4자리 제외  "*"삽입
		for(int i = 0; i < temp.length-4; i++) {
			temp[i] = "*";
		}
		//answer에 문자배열 저장
		for(int i = 0; i < temp.length; i++) {
			answer += temp[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_17 test = new Level1_17();
		
		//테스팅 출력문
		String phone_number = "123456789";
		
		System.out.println(test.solution(phone_number));
	}
}
