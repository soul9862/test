package Algorithm.src.programmers.level1;

import java.util.Arrays;

//두 개 뽑아서 더하기
public class Level1_43 {

    public int[] solution(int[] numbers) {
        int[] answer = {};

        int tempIdx = 0;

        for(int i = numbers.length-1; i > 0; i--){
            tempIdx += i;
        }
        int[] temp = new int[tempIdx];
        System.out.println(tempIdx);

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                temp[tempIdx - 1] = numbers[i] + numbers[j];
                System.out.println(tempIdx + " " + i + " " + j);
                tempIdx--;
            }
        }
        System.out.println(Arrays.toString(temp));

        return answer;
    }

}
