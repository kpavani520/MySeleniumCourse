package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8AutoDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement editbox=driver.findElement(By.id("autocomplete"));
		editbox.sendKeys("Ind");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
WebElement move=driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[2]/div"));
 a.moveToElement(move).click().build().perform();
  System.out.println(editbox.getAttribute("value"));
	}

}
/*driver.findElement(By.id("autocomplete")).sendKeys("ind");

Thread.sleep(2000);

driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); */

   
