package aop;

public class AspectJTest {
	public void test(){}

//	@Before("test()")
	public void beforeTest(){
		System.out.println("beforeTest");
	}

}
