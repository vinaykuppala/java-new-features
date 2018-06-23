package com.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamExamples {
    
    public static void main(String[] args){
        
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(System.out::println);
        
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayFull.forEach(System.out::println);
        streamOfArrayPart.forEach(System.out::println);
        
        Random random = new Random();
        Stream<Integer> streamGenerated =
        Stream.generate(() -> random.nextInt()).limit(10);
        streamGenerated.forEach(val -> System.out.println(val));
        
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().filter(val -> val.equals("a")).forEach(System.out::println);
        
        
    }
}
