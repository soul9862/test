package hello.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }

    public static int findSmallest(List<Integer> arr){
        int smallest = arr.get(0);
        int smallest_index = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < smallest){
                smallest = arr.get(i);
                smallest_index = i;
            }
        }

        return smallest_index;
    }

    public static List<Integer> selectionSort(List<Integer> arr){
        List<Integer> newArr = new ArrayList<>(arr.size());
        for(int i = 0; i < arr.size(); i++){
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));
            arr.remove(smallest);
        }

        return newArr;
    }
}
