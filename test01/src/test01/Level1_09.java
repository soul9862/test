package test01;

public class Level1_09 {

	public String findKim(String[] seoul){
		//x에 김서방의 위치를 저장하세요.
		int x = 0;

		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i] == "Kim") {
				x=i;
			}
		}
		
		return "김서방은 "+ x + "에 있다";
	}

	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		Level1_09 kim = new Level1_09();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}
