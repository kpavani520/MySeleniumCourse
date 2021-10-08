package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@type= 'email']")).sendKeys("kpavani520");
        driver.findElement(By.xpath("//input[@name= 'pw']")).sendKeys("cdsjdscjds"); 
        driver.findElement(By.xpath("//input[@value= 'Log In']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@role= 'alert']")).getText());
	}
	

}
