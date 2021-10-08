package SeleniumBasicExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getClass());
		System.out.println(driver.getWindowHandle());
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.yahoo.com");
		//n,,nb, ndriver.close();
		driver.quit();

	}

}
