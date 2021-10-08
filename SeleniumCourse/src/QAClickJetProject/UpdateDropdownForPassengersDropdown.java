package QAClickJetProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdownForPassengersDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//clicking on passenger dropdown tool bar
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
		//clicking on adult + button for 4 times
		//by using while loop
		/*int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}*/
		//by using for loop
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i = 1; i<5 ; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
		//for done button in dropdown menu
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
