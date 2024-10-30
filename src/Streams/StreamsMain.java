package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMain {
    public static void main(String[] args) {

//        Q. Lets count the salaries of employees having more than 10k?

//        Traditional Approach or Non Streams approach.

//        List<Integer> salaries = Arrays.asList(10000,20000,4000,22000,12000,8000);
//        int count =0;
//
//        for(int i: salaries) {
//            if(i>10000)
//                count++;
//        }
//        System.out.println("Employees with salaries more than 10k are -> "+count);

//      The same can be achieved with streams. Power of Java 8
//        count=0;
//        count = (int) salaries.stream().filter((Integer sal)->  sal>10000).count();
//        System.out.println("Employees with salaries more than 10k are -> "+count);
//



//        Different ways to create a stream.

//     1.   From Collections

//        List<Integer> list = Arrays.asList(1,2,3,4);
//
//        Stream<Integer> streamForList = list.stream();
//
////     2.   From Array
//
//        Integer[] array = {1,2,3,4};
//        Stream<Integer>  streamForArray = Arrays.stream(array);
//
////      3. From Static Method
//        Stream<Integer> streamFromStaticMethod = Stream.of(1,3,4,5);
//
////        4. From Stream Builder
//
//        Stream.Builder<Integer> streamBuilder = Stream.builder();
//        streamBuilder.add(1).add(2).add(3);
//
//        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();
//
////        5. Stream Iterate
//
//        Stream<Integer> streamFromIterate = Stream.iterate(100, (Integer n) -> n+10).limit(5);

//        1. FILTER()

//        Stream<Integer> numsStream   = Stream.of(4,5,3,2,1,20,12);
//
//        List<Integer> nums = numsStream.filter((Integer val) -> val >= 3).collect(Collectors.toList());
//
//        System.out.println(nums);


//        2. MAP()

//        Stream<String> stringStream = Stream.of("i","am","batman");
//
//        stringStream.map((String str) -> str.toUpperCase()).forEach((String str) -> System.out.print(str +" "));

//        3. FLATMAP()

//        List<List<String>> sentenceList = Arrays.asList(
//                Arrays.asList("I","Love","JAVA"),
//                Arrays.asList("Best","Programming","Language"),
//                Arrays.asList("Java","Is","My","Bava")
//        );

//        Stream<String> fullSentence = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream());
//        System.out.println( fullSentence.collect(Collectors.joining(" ")));


//        Stream<String> fullSentence = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream()).map((String s)-> s.toUpperCase());
//        System.out.println( fullSentence.collect(Collectors.joining(" ")));

//        4. distinct()

//        Integer[] arr = {1,3,4,5,5,62,2,3,1};
//
//        Arrays.stream(arr).distinct().forEach( (Integer val) -> System.out.print(val +" "));

//        5. sorted()

//        Integer[] arr = {1,3,4,5,5,62,2,3,1};
//
//        Arrays.stream(arr).sorted().forEach( (Integer val) -> System.out.print(val +" "));



//        Integer[] arr = {1,3,4,5,5,62,2,3,1};
////      desc order
//        Arrays.stream(arr).sorted((Integer a,Integer b) -> b-a).forEach( (Integer val) -> System.out.print(val +" "));

//             6. peek()

//            List<Integer> list = Arrays.asList(1,23,2,4,66,2);

//            List<Integer> res = list.stream().sorted().peek((Integer val)-> System.out.print(val+" ")).filter((Integer a) -> a>2).collect(Collectors.toList());
//
//        System.out.println();
//        System.out.println(res);


//        7. limit()
//        List<Integer> list = Arrays.asList(1,23,2,4,66,2);
//
//        List<Integer> res = list.stream().limit(4).collect(Collectors.toList());
//        System.out.println(res);


//        8. skip()

//        List<Integer> list = Arrays.asList(1,23,2,4,66,2);
//
//        List<Integer> res = list.stream().skip(2).collect(Collectors.toList());
//        System.out.println(res);


//        9. mapToInt()

        List<String> numbers = Arrays.asList("1","2","3");
        IntStream numStream = numbers.stream().mapToInt((String val) -> Integer.parseInt(val));
        int[] numArray = numStream.toArray();
        for(int i:numArray)
            System.out.print(i + " ");

        System.out.println();

        int[] arr = {2,2,24,3,66,4};
        IntStream arrStream = Arrays.stream(arr);
        int[] filterArr = arrStream.filter((int val)-> val>2).toArray();


        for(int i:filterArr)
            System.out.print(i +" ");




    }


}
