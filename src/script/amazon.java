package script;
	
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.WebBase;
import pom.AmazonPage;

public class amazon extends WebBase
	{
		@Test(priority=1)
		public void login() throws InterruptedException
		{
			try
			{			
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			AmazonPage amazon = new AmazonPage(driver);	
			amazon.enterbook();
			amazon.ClickElement();
			
			  }catch(Exception e)
			{
				Reporter.log(e.getMessage(),true);
				Assert.fail();}
			}
						

	
	
	

}
