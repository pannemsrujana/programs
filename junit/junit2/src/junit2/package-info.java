package junit2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.commons.util.ModuleUtils;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathutilsTest1{
	@BeforeAll
	void runsbeforeallstest() {
		System.out.println("@BeforeAll");
	}
	@AfterAll
	void runsafteralltest() {
		System.out.println("@AfterAll");
	}
	@BeforeAll
	void first()
	{
		MathutilsTest1 MathutilsTest1 = new ModuleUtils();
		System.out.println("@BeforeEach");
	}
	@AfterAll
	void last()
	{
		System.out.println("@AfterEach is cleaned up");
	}
	@Test
	void test1() {
		int expected=6;
		int actual=MathutilsTest1.add(4,2);
		assertEquals(expected,actual,"add two numbers");
		System.out.println("test1 pass");
	}
	private void assertEquals(int expected, int actual, String string) {
		// TODO Auto-generated method stub
		
	}
	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Test
	void test2() {
		int expected=6;
		int actual=MathutilsTest1.sub(12,6);
		assertEquals(expected,actual,"sub two numbers");
		System.out.println("test2 pass");
	}
	private static int sub(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}