package hello.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {
    public static void main(String[] args) {

        int[] array = {10, 5, 2, 3};

        System.out.println(quicksort(Arrays.stream(array).boxed().collect(Collectors.toList())));

        System.out.println(count(array));

        System.out.println(max(array));
    }

    public static List<Integer> quicksort(List<Integer> array){

        if(array.size() < 2) return array;
        else{
            Integer pivot = array.get(0);
            List<Integer> less = array.stream()
                    .skip(1)
                    .filter(param -> param <= pivot)
                    .collect(Collectors.toList());

            List<Integer> greater = array
                    .stream()
                    .skip(1)
                    .filter(param -> param > pivot)
                    .collect(Collectors.toList());

            return Stream.of(
                    quicksort(less).stream(),
                    Stream.of(pivot),
                    quicksort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());

        }
    }

    public static int count(int[] array){

        if(array.length == 0) return 0;
        else {
            return 1 + count(Arrays.copyOfRange(array, 1, array.length));
        }
    }
    
    public static int max(int[] array){
        if(array.length == 2){
            return array[0] > array[1] ? array[0] : array[1];
        }
        int subMax = max(Arrays.copyOfRange(array, 1, array.length));
        return array[0] > subMax ? array[0] : subMax;
    }

}
