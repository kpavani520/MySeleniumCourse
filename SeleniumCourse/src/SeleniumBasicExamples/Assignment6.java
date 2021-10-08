package SeleniumBasicExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='option2']")).getText());
		String option=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	    Select dropdowns = new Select(dropdown);
	    dropdowns.selectByVisibleText(option);
	    driver.findElement(By.id("name")).sendKeys(option);
	    driver.findElement(By.id("alertbtn")).click();
	    //System.out.println(driver.switchTo().alert().getText());
	    String text=driver.switchTo().alert().getText();
	    if(text.contains(option)) {
	    	System.out.println("Alert is success");
	    }
	    else {
	    	System.out.println("Alert is faild");
	    }
	   
	    driver.switchTo().alert().accept();
	    //driver.findElement(By.id("confirmbtn")).click();
	}

}
