package Level2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// 라면공장
public class Level2_25 {
	public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Queue<Integer> Queue = new PriorityQueue<>(Comparator.reverseOrder());

		int index = 0;
		for (int i = 0; i < k; i++) {
			if (index < dates.length && i == dates[index])
				Queue.add(supplies[index++]);

			if (stock == 0) {
				stock += Queue.poll();
				answer++;
			}
			stock--;

		}
        return answer;
    }
}
