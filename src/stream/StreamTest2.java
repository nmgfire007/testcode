package stream;

import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 2).limit(5);
        iterateStream.forEach(i->{
            System.out.println(i);
            System.out.println(i+1+"dev1"+"_01");
			System.out.println(i+1+"dev1"+"_cherry pick");
			System.out.println(i+1+"dev1"+"_cherry pick"+"last new");
        });
    }
}
