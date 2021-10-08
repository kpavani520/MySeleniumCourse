import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("kpavani520@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("nihanth082322");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		//(driver.findElement(By.xpath("//*[@class='_9ay7']")).getText();//
	}

}
