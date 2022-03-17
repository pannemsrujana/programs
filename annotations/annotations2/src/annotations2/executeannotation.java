package annotations2;
import static java.lang.annotation.elementtype.method;
import static java.lang.annotation.retentionpolicy.runtime;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
@Interface Execute{
	int sequence;
}
class myclass{
	@Execute(sequence=3)
	public void method1() {
		System.out.println("world");
	}
	@Execute(sequence=1)
	public void method2() {
		System.out.println("my");
	}
	@Execute(sequence=2)
	public void method3() {
		System.out.println("hello");
	}
}
public class executeannotation {

	public static void main(String[] args) {
		     myclass c=new myclass();
		     c.method2();
		     c.method3();
		     c.method1();

	}

}
