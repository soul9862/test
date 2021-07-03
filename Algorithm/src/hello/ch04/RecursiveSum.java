package hello.ch04;

import java.util.Arrays;

public class RecursiveSum {
    private static int sum(int[] arr) {

        if (arr.length == 0) return 0;
        else return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));

    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{5,4,3,6,8,31,23}));
    }
}
