import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeXpathSearchElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("flower images");
		
		
	}

}
