package baek.joon;

import java.util.ArrayList;

// Baekjoon Online Judge 4673번 
//생성자가 없는 숫자를 셀프 넘버
public class SelfNumber {

	//10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	// selfnumber 함수
	public int SelfNumberMath(int n) {
		int answer = n;
		System.out.println("n = " + n);
		// 하나의 값 분해 및 함수적용
		while(true) {
			answer += n % 10;
			n /= 10;
			if(n < 100) {
				answer += n % 10;
				answer += n / 10;
				if(answer >= n) answer = n;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		ArrayList<Boolean> BoolList;
		int n = 10000;
		int answer = 0;
		BoolList = new ArrayList<Boolean>(n+1);

		// selfnumber 일 경우 true
		BoolList.add(true);
		for(int i = 1; i <= n; i++) {
			BoolList.add(i, false);
		}
		


		// Math 호출
		SelfNumber sn = new SelfNumber();
		//		count = sn.SelfNumberMath(count);
		//		System.out.println(count);

		for(int i = 1; i <= n; i++) {
			answer = i;
			answer = sn.SelfNumberMath(answer);
			BoolList.set(answer, true);
			
		}
	}
}
