import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressionForCssXpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("kpavani520@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("nihanth082322");
		driver.findElement(By.xpath("//button[contains(@id,'u')]")).click();
		/*driver.findElement(By.cssSelector("input[class*='input']")).sendKeys("kpavani520@gmail.com");
		driver.findElement(By.cssSelector("*[type*='pass']")).sendKeys("nihanth082322");
		driver.findElement(By.cssSelector("*[type*='submit']")).click();*/
	}

}
