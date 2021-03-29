package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class WebBase implements AutoConst
{
	static 
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	public  WebDriver driver;
	
	//@BeforeClass
	public void openApplication() throws InterruptedException
	{
		try
		{
			ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--headless");	
			// Runtime rt = Runtime.getRuntime();
	          
	        // rt.exec("cmd.exe /c cd qres\""+"\" & start cmd.exe /k \"  QRes.exe /x:1920 /y:1080\\\"");//to set the screen resolution
	        // rt.exec("cmd.exe /c exit");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		Thread.sleep(2000);
		}catch(Exception e)
		{
			//Reporter.log("Server down",true);
			System.out.println(e);
		}
	}
	

	//@AfterClass
	public void closeApplication()
	{
		driver.quit();
	}	

}
