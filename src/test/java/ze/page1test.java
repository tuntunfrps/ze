package ze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class page1test 
{

	public static WebDriver driver;
public	static String title;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F://Selenium_BizLee//Cpied_software//Chrome_driver//chromedriver.exe");
		 driver=new ChromeDriver();		
	}
@Test
public void main()
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://google.com/");
	String Actual_title=driver.getTitle();
	System.out.println(Actual_title);
	Assert.assertEquals(Actual_title, "Google");
	
	

}

	}


