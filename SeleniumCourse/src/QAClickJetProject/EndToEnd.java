package QAClickJetProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Auto suggestion
		/*driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) {
		
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
					
		}*/
		//checkbox
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("//*[text()='One Way']")).click();
		//driver.findElement(By.xpath("//*[text()='Round Trip']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//dynamic dropdown
		driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value= 'BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value= 'BHO']")).click();
		//radio button and calender
		driver.findElement(By.xpath("//*[text()='24']")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		//driver.findElement(By.xpath("(//*[text()='18'])[2]")).click();
		//update buttons dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i = 1; i<5 ; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
		//for done button in dropdown menu
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//for static dropdown
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		//inorder to select perticular index we use this
		//dropdown.selectByIndex(3);
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByValue("AED");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//checking box
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//for search button
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		

		
	}
		

	}


