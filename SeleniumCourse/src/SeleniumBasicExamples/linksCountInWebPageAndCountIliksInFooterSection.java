package SeleniumBasicExamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCountInWebPageAndCountIliksInFooterSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//to get the count of all the links in the web page that will have tagName as 'a'
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Concept: LIMITING WEBDRIVER SCOPE
		//Inorder to get the link in footer of the web page we should create a sub/mini driver frome the driver with webelement i.e.,
        WebElement minidriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(minidriver.findElements(By.tagName("a")).size());
        //to get the perticular column links in the footer
        WebElement columndriver=minidriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        //For opening each and evry links in seperate windows
        for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) 
        {
        	
        	String clickonlinktab=Keys.chord(Keys.COMMAND,Keys.ENTER);
        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
        	Thread.sleep(5000l);
        }//For going to each and every window and printing the title
        	Set<String> windows =driver.getWindowHandles();
        	Iterator<String> it=windows.iterator();
        	while(it.hasNext())
        	{
        		driver.switchTo().window(it.next());
        		System.out.println(driver.getTitle());
        	}
        
	}

}
