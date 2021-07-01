package Algorithm.src.hello.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {
    public static void main(String[] args) {
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3))); // [2, 3, 5, 10]
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
}
