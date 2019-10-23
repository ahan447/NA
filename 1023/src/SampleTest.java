import org.junit.jupiter.api.Test;

import junit.framework.TestCase;




public class SampleTest extends TestCase {
	@Test
	public void test1() {
		System.out.printf("덧셈 : %d\n", new Sample().add(100, 300));
	}
	//@Test가 없어서 수행도지 않음
	public void test2() {
		System.out.printf("뺄셈 : %d\n", new Sample().minus(100, 300));
	}
}
