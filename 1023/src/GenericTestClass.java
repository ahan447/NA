import org.junit.jupiter.api.Test;

import junit.framework.Assert;
public class GenericTestClass {
	@Test
	public void test1() {
		@Test
		//메소드의 수행결과가 400이면 메시지가 없음
		//메소드의 수행결과가 400이 아니면 예외가 발생
		Assert.assertEquals(new Sample().add(100, 300) , 400);
		
		
		//System.out.printf("덧셈 : %d\n", new Sample().add(100, 300));
	}
	//@Test가 없어서 수행도지 않음
	public void test2() {
		System.out.printf("뺄셈 : %d\n", new Sample().minus(100, 300));
	}
}
