package Level2;

public class Level2_01 {
	public boolean isHarshad(int num){

		String test = "";
		test = String.valueOf(num);
		int temp = 0;
		
		for(int i = 0; i < test.length(); i++) {
			temp += Integer.parseInt(test.substring(i, i+1));
		}
		if(num % temp == 0) {
			return true;
		}else {
			return false;	
		}
		
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		Level2_01 sn = new Level2_01();
		System.out.println(sn.isHarshad(11));
	}
}
