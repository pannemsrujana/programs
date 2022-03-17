package L.E6;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class methods {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Supplier<Integer>supplier=()->new Integer((int)(match.random()*10000));
        System.out.println("supplier API");
        
        Consumer<Integer>consumer=(value)->System.out.println("value");
        System.out.println("consumer API");
        
        Predicate predicate=(value)->value+3;
        System.out.println("predicate API");
        
        Function<Long,Long>adder=(value)->value + 3;
        long resultlamda=adder.apply((long)8);
        System.out.println("resultlamda function API="+resultlamda);
	}

}
