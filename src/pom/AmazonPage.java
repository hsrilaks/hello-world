
	
	package pom;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AmazonPage {
		
		@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
		WebElement books;
		
		@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
		WebElement enterbrand;
		
		@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
		WebElement clickele;
	   
		public AmazonPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public void enterbook() throws InterruptedException
		{
			books.sendKeys("Books");
			Thread.sleep(2000);
		}
		
		public void EnterBrand(String sms) throws InterruptedException
		{
			enterbrand.sendKeys(sms);
			Thread.sleep(2000);
		}
	    
	    public void ClickElement() throws InterruptedException
	    {
	        clickele.click();
	        Thread.sleep(2000);
	    }	
		
	}






