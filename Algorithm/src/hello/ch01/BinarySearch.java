package Algorithm.src.hello.ch01;

import Algorithm.src.kakao.first_2017.secretMap;

// 찾는 회수
public class BinarySearch {
    public static void main(String[] args) {
        Integer result = binarySearch(new int[]{1, 2, 4, 6, 7, 10, 14, 16, 20, 30, 33}, 6);
        System.out.println(result);
    }

    public static Integer binarySearch(int[] list, int item){
        int low = 0;
        int high = list.length - 1;
        int count = 0;

        while (low <= high){
            count++;
            int mid = (low + high) / 2;
            int temp = list[mid];
            System.out.println("list[mid]" + temp);
            System.out.println("mid" + mid);
            if(temp == item){
                return count;
            }else if(temp > item){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return count;
    }
}
