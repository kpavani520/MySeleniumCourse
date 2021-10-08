import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdenfifySingleBrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//first get the urls by using selenium
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		//second use java methods to get validation whearther the links are broken are not
		//here URL is ajava class openconnection is a method and Httpurlconnection is retun type of method and we did type casting
		HttpURLConnection connect=(HttpURLConnection)new URL(url).openConnection();
		connect.setRequestMethod("HEAD");
		connect.connect();
		int result=connect.getResponseCode();
		System.out.println(result);
		

	}

}
