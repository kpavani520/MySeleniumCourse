package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assaignment2 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com/");

		// calendar

		driver.findElement(By.id("DepartDate")).click();

		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();

		// Dynamic dropdown

		WebElement adult = driver.findElement(By.id("Adults"));
		Select s = new Select(adult);
		s.selectByIndex(2);

		// Dynamic Dropdown

		WebElement ch = driver.findElement(By.id("Childrens"));

		Select s1 = new Select(ch);
		s1.selectByIndex(2);
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();

		// printing error message in console

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
