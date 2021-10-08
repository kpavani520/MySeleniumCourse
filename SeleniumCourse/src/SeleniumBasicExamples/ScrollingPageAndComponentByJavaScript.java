package SeleniumBasicExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingPageAndComponentByJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//to scroll the page
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		//to scroll the component in the page
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); 
		//to get the sum of a column
		List<WebElement> amount=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0;i<amount.size();i++)
		{
			
			int values=Integer.parseInt((amount.get(i).getText()));
			sum = sum + values;
			//System.out.println(sum);
			
		}
		
			System.out.println(sum);
			int value=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
			//int num=Integer.parseInt(value[1].trim());
			/*System.out.println("num=" +value);
			if(sum==value)
			{
				System.out.println("Success");
			}
			else {
				System.out.println("Failure");
			}*/
			Assert.assertEquals(sum, value);

	}

}
