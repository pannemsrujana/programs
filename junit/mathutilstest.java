package junit2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ModuleUtils;

class mathutilstest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@BeforeAll
	static void runsbeforeallstest() {
		System.out.println("@BeforeAll");
	}
	@AfterAll
	static void runsafteralltest() {
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
	}
	@Test
	void test2() {
		int expected=6;
		int actual=MathutilsTest1.sub(12,6);
		assertEquals(expected,actual,"sub two numbers");
		System.out.println("test2 pass");
	}
	}
}
}
