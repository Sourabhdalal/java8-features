package org.example;

import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        walkable w = ((steps, isEnabled) -> {
            System.out.println("Walking in the street");
            return 2*steps;
        });

        w.walk(2,true);

        walkable w2 = (steps, isEnabled) -> 2;

//        List<String> fruits = List.of("Apple", "Kiwi", "Banana");
//        Stream<String> s = fruits.stream();
//
//        s.sorted().map(f -> f.length()).forEach(f -> System.out.println(f));
    }
}


//Functional interface
interface walkable{
    int walk(int steps , boolean isEnabled);
}