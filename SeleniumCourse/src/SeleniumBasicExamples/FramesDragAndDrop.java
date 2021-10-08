package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// we can know how many index by writing this cmd
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// switching to frame by using indexes
		driver.switchTo().frame(0);
		// switching to frame by using webElements
		// driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
		 Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		//after performing operations with frames we come back to normal page by
		driver.switchTo().defaultContent();
		// driver.close();

	}

}
