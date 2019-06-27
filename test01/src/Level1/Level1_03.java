package Level1;

class Fibonacci{
	public long fibonacci(int num) {
		long answer = 0;
		
		int f[] = new int[num+1];
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 2; i <= num; i++) {
			f[i] = f[i-1] + f[i-2];
			
			answer = f[i];
			
		}
		
		return answer;
	}
	
}

public class Level1_03 {
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		
		System.out.println(c.fibonacci(testCase));
	}
}