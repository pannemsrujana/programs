package annotations3;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.Retentionpolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
@Interface run{
	
}
class c{
	@run
	void run() {
		System.out.println("run the test");
	}
}
public class hello {

	public static void main(String[] args) {
		c a=new c();
		a.run();

	}

}
