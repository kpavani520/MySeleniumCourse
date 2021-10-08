package SeleniumBasicExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText());
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("January 2022"))
		{
			
	    driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();;
			
		}
		List<WebElement> dates=driver.findElements(By.className("day"));
        int count=driver.findElements(By.className("day")).size();
        for(int i=0;i<count;i++) {
        	String text=driver.findElements(By.className("day")).get(i).getText();
        	//Thread.sleep(2000L);
        	if(text.equalsIgnoreCase("23")) 
        	{
        		driver.findElements(By.className("day")).get(i).click();
        		break;
        		
        	}
        }
	}

}
