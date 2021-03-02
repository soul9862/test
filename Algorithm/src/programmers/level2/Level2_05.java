package Algorithm.src.programmers.level2;


public class Level2_05 {
	int numberOfPrime(int n) {
		int result = 0;
		// �Լ��� �ϼ��ϼ���.
		boolean test;

		if(n == 1) {
			result = 0;
		}else if(n == 2) {
			result = 1;
		}else {
			result = 1;
			
			for(int i = 3; i <= n; i++) {
				test = true;
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						test = false;
						break;
					}	
				}
				if(test == true) {
					result++;
				}
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		Level2_05 prime = new Level2_05();
		System.out.println( prime.numberOfPrime(10) );
	}

}
