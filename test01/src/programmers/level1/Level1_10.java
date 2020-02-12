package Level1;

import java.util.Arrays;

public class Level1_10 {

	public int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		int n = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				n++;
			}
		}
		
		int[] ret = new int[n];
		n = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				ret[n] = array[i];
				n++;
			}
		}
		return ret;
	}
	
	//아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Level1_10 div = new Level1_10();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}
