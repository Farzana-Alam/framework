import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	
	public static void main (String [] args) throws InterruptedException 
	{
		System.out.println("start");

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.priceline.com/?kw=priceline&match=be&refid=PLMSNB&refclickid=D%3AcBRAND16054118170o73392587648371267763808kwd-73392543766662%3Aloc-190&msclkid=64732ab7bf71151dda187464bc1fedc0&utm_source=bing&utm_medium=cpc&utm_campaign=Brand%7CUS%7CDesktop%7CPriceline&utm_term=priceline&utm_content=Priceline%7CBrand%7CMain%7CRoot%7CExact&slingshot=1081&vrid=0bb96024cf443b94d197e0276b119e67");
		driver.manage().window().maximize();
		


		WebElement element=driver.findElement(By.xpath("//div[contains(@class,'fV')]//div[contains(@src,'//s1.pclncdn.com')][contains(@class,'Kaley')]"));	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	    Thread.sleep(3000);
	    Actions act=new Actions (driver);
	    act.moveToElement(element).build().perform();
	    Thread.sleep(3000);

	    

	
	    
	    
	}
}


