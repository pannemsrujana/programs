package L.E3;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class oddlength {

	public static void main(String[] args) {
		/*List<String> names=new arraylist();
		 names.add("srujana");
		 names.add("sruju");
		 names.add("bujji");*/
		Stream<String>s=Stream.of("hello","world");
		Consumer<String>a=str->System.out.println(str.toUpperCase());
		 a.accept("hello");

	}

}
