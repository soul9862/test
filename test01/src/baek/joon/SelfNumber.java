package baek.joon;

import java.util.ArrayList;

// Baekjoon Online Judge 4673�� 
//�����ڰ� ���� ���ڸ� ���� �ѹ�
public class SelfNumber {

	//10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// selfnumber �Լ�
	public int SelfNumberMath(int n) {
		int answer = n;
		System.out.println("n = " + n);
		// �ϳ��� �� ���� �� �Լ�����
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

		// selfnumber �� ��� true
		BoolList.add(true);
		for(int i = 1; i <= n; i++) {
			BoolList.add(i, false);
		}
		


		// Math ȣ��
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
