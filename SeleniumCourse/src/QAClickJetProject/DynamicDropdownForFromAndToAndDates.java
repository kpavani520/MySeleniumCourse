package QAClickJetProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownForFromAndToAndDates {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value= 'BLR']")).click();
		//Thread.sleep(2000L);
		/*driver.findElement(By.xpath("(//a[@value= 'BHO'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='18']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("(//*[text()='18'])[2]")).click();*/
		
		//Xpath for parent child relationship
		driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value= 'BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value= 'BHO']")).click();
	}

}
