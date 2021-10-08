package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckingAndUnCheckingAssaginment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id= 'checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id= 'checkBoxOption1']")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id= 'checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id= 'checkBoxOption1']")).isSelected());
		// to get number of checkboxes present
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 3);

	}

}
