package SeleniumBasicExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7NoOfRowColumnsTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
		System.out.println(driver.findElements(By.cssSelector(".table-display td")).size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
		
		}
		
		
		

	
	



	/*driver.get("http://qaclickacademy.com/practice.php");



	WebElement table=driver.findElement(By.id("product"));



	System.out.println(table.findElements(By.tagName("tr")).size());



	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



	List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



	System.out.println(secondrow.get(0).getText());



	System.out.println(secondrow.get(1).getText());



	System.out.println(secondrow.get(2).getText());*/

	
	}
	

