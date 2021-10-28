package aop;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {
		System.out.println("test");
	}

	private String testStr = "testStr";

}
