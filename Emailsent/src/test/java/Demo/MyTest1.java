package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class MyTest1 {
  @Test
  public void myTest() {
	  
	int a=90;
	int b=100;
	  
	Assert.assertEquals(a,b);  
	 System.out.println("====Test Done====="); 
  }
  @BeforeClass
  public void beforeClass() {
	 System.out.println ("=====Starting the test======");
	  
  }

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException {
	  if(result.getStatus()==ITestResult.FAILURE){
	  Send_Email .sent_email();  
	  System.out.println("Test Failed and Email Sent");
	  
	  
  }

}
}
