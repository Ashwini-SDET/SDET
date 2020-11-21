package Session17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DemoTwo {
	
	@Test
    public void TestCase() {
        System.out.println("I'm in the test case from DemoTwo Class");
    }
  

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
