package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorForFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
WebDriver driver = new ChromeDriver();
driver.get("https:www.facebook.com");
driver.findElement(By.cssSelector("#email")).sendKeys("kpavani520@gmail.com");
driver.findElement(By.cssSelector("#pass")).sendKeys("nihanth082322");
driver.findElement(By.cssSelector("div._6ltg")).click();
	}

}
