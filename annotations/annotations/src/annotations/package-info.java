package annotations;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.target;

@Retention(RUNTIME)
@target(METHOD)
@interface Test{
	
}

class A{
	@Test
	void run() {
		System.out.println("run the test");
	}
}
class B{
	@Test
	void stop() {
		System.out.println("stop the test");
	}
}
class TestAnnotation{
	
	public static void main(String[] args) {
		A a=new A();
		a.run();
		B b=new B();
		b.stop();
	}
}