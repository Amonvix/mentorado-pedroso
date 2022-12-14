package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::println;
        Consumer<Object> print1 = System.out::println;

        Stream<String> lang = Stream.of("Java ", "Lua ", "JS\n");
        lang.forEach(print);

        String[] maisLangs = { "Python ", "Lisp ", "Pearl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1 , 2).forEach(print);
        
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin ");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Stream.generate(()-> "a").forEach(print);
        Stream.iterate(0, n->n+1).forEach(print1);





    }
}
