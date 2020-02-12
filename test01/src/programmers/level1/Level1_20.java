package Level1;

import java.util.Arrays;

// 제일 작은 수 제거
public class Level1_20 {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int min = 0;
		int index = 0;

		if(arr.length == 1) {
			//answer = new int[arr.length];
			answer = new int[] {-1};
		}else {
			answer = new int[arr.length-1];
			for(int i = 0; i < arr.length; i++) {
				min = arr[0];	    	  
				if(arr[i] < min) {
					min = arr[i];
				}

			}
			for(int i = 0; i < arr.length; i++) {
				if(min != arr[i]) {
					answer[index] = arr[i];

					index++;
				}
			}

			// Copy the elements at the left of the index.
			//System.arraycopy(arr, 0, answer, 0, index);
			// Copy the elements at the right of the index.
			//System.arraycopy(arr, index + 1, answer, index, arr.length - index - 1);

		}
		return answer;

		/*
*참조
class Solution {
  public int[] solution(int[] arr) {
      int[] answer = {};
        int min = arr[0];

	-최솟값 저장
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

	-배열크기가 1인 경우 -1반환
        if (arr.length - 1 == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[arr.length - 1];
            int idx = 0;

            for (int num : arr) {
                if (num != min) {
                    answer[idx] = num;
                    idx++;
                }
            }
        }

      return answer;
  }
}
출처 : https://thiago6.tistory.com/127
		 * 
		 */
	}
	public static void main(String[] args) {
		Level1_20 test = new Level1_20();
		int[] arr = {};
		arr = new int[] {3,4,5,6};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(test.solution(arr)));
		System.out.println(test.solution(arr).length);
	}
}
