package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssWithWrongUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "//Users//pavani//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		/*driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("kpavani520");
		driver.findElement(By.cssSelector("#password")).sendKeys("nihanth");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());*/
		

	}

}
