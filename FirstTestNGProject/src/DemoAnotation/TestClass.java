package DemoAnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

	@BeforeClass
	public void beforeChildClass() {
		System.out.println("Child Before Class Method");
	}

	@AfterClass
	public void afterChildClass() {
		System.out.println("Child After Class Method");
	}

	@BeforeMethod
	public void beforeChilMethod() {
		System.out.println("Child before method");
	}

	@AfterMethod
	public void afterChildMethod() {
		System.out.println("Child After Method");
	}

	@Test
	public void TestMethod() {
		System.out.println("Test Method under TestClass");
	}

}
