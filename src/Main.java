import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {


        List<Integer> ints = new ArrayList<>(Arrays.asList(2, 4, 6, 3));
        ints.get(0).intValue();
        ints.stream().mapToInt(e -> e.intValue()).average().getAsDouble();

        BiFunction<Integer, Integer, Double> bifct = (a, b) -> (a + b) / 2.5;
        System.out.println(bifct.apply(3, 4));

        Function<Integer, Integer> sum = (Integer inputMuuttuja) -> inputMuuttuja + 2;
        Function<Integer, Integer> sum2 = a -> {
            final int k = a + 2;
            return k + 2;
        };
        Function<Integer, Function<Integer, Integer>> sum3 = a -> sum;
        Function<Integer, Function<Integer, Integer>> sum4 = a -> b -> b+2;
        System.out.println(sum2.apply(2)); //expect 6
        System.out.println(sum3.apply(2)); //expect 4
        System.out.println(sum4.apply(2).apply(2)); //expect 4

        //Example on Functions with Function as return value
        //Outer function takes an integer as input (from "apply) and returns a function
        //Inner function takes an (another) integer as input (from its own "apply") and returns
        //a value that makes use of the outer function input
        //As an additional feature, an int, declared as final for explicitness, is used to generate the return value
        final int increment = 2;
        Function<Integer, Function<Integer, Integer>> sum5 = a -> (b -> a + b + increment);
        System.out.println(sum5.apply(2).apply(2)); //expect 6
        //or put differently
        Function<Integer, Integer> outerF = sum5.apply(2);
        int result = outerF.apply(2);
        System.out.println(result);

    }
}
