package Level2;

public class Level2_04 {
	public int reverseInt(int n){
		
		String strInt = Integer.toString(n);
		char[] arr = strInt.toCharArray();
		String  test = "";
		int answer = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i; j < arr.length; j++) {
				char temp = 0;
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			test += arr[i];
		}
		answer = Integer.parseInt(test);
	    
		return answer;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		Level2_04 ri = new Level2_04();
		System.out.println(ri.reverseInt(118372));
	}
}
