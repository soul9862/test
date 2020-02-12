package kakao.first_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class failureRate {
	public int[] solution(int N, int[] stages) {
		int[] answer = {};
		answer = new int[N];
		int user = stages.length;

		// 최초 연산 값
		double[] temp = {};
		temp = new double[N];
		
		// 정렬 값
		List<Double> tempList = new ArrayList<>();
		
		for(int i = 0; i < user; i++) {
			if(stages[i] != N+1) {
				answer[stages[i]-1] += 1;
			}
		}

		for(int i = 0; i < N; i++) {
			temp[i] = (double) answer[i] / user;
			tempList.add(temp[i]);
			user -= answer[i];

			//System.out.print("user : " + user);
			//System.out.println("\ttemp[i] : " + temp[i]);
		}
		Collections.sort(tempList);
		Collections.reverse(tempList);
		
		for(int i = 0; i < N; i++) {
			System.out.println("리스트 값 : "+ tempList.get(i));
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= N; j++) {
				if(tempList.get(i) == temp[j]) {
					System.out.println("temp[i] : " + temp[i]);
					System.out.println("tempList.get(j) : " + tempList.get(j));
					temp[j]=-1.0;
					answer[i] = j+1;
					break;
				}
			}
			System.out.println("");
			System.out.println("====================");
		}

		return answer;
	}
}
