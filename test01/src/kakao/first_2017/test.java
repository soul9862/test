package kakao.first_2017;

public class test {
	public static void main(String[] args) {
//		traffic traffic = new traffic();
//		
//		String[] lines = {};		
//		
//		int answer = traffic.solution(lines);
//		
//		System.out.println("answer : ... " + answer);
		
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		secretMap sm = new secretMap();
		String[] answer = sm.solution(n, arr1, arr2);
		for(int i = 0; i < n; i++) {
			System.out.println(answer[i]);
		}
	}
}
