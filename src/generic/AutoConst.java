package generic;

public interface AutoConst 
{
	String CHROME_KEY="webdriver.chrome.driver";
	//String CHROME_VALUE="/usr/bin/chromedriver";
	String CHROME_VALUE="./driver/chromedriver.exe";
	String FARMERAPK="./data/farmer.apk";
	String FIELDAPK="./data/field.apk";
	String CONFIG_PATH="./data/config.properties";
	String WRITE_PATH="./data/write.properties";
	String ADMINCONFIG_PATH="./data/AdminLoginTest.properties";
	String XLPATH="/FALCA/data/input.xlsx";
	String WRITEXLPATH="./data/output.xlsx";
	String DIGITALAPK="./data/Falca_DSC.apk";
	String CONFIG_PATHA="./data/configC.properties";
	String CONFIG_PATHB="./data/configA.properties";
	String CONFIG_PATHC="./data/configB.properties";
	

}





/*Automation plan:
login, farmer add and edit, farmer transaction- config
buyer add and edit, Consumer transaction- configA
Agent add and edit, fpo add and edit -ConfigC
add and edit - logistic and vendor - cofigB*/