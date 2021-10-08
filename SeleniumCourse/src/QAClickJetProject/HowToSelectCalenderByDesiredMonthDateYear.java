package QAClickJetProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToSelectCalenderByDesiredMonthDateYear {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","//Users//pavani//Downloads//chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//using css selector getting current date
	//driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
	//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//Using Xpath Parent child relationship
	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div'] //*[text()=18]")).click();
	
}
}