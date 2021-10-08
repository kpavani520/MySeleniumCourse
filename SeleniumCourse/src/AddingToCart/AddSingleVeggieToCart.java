package AddingToCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSingleVeggieToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
	/*List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	System.out.println(products.size());
	Thread.sleep(2000);
		for(WebElement product:products) {
			String name = product.getText();
			if(name.contains("Cucumber - 1 Kg")) {
				product.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				break;
			}
			
		}*/String[] veggie = {"Cucumber"};
		//driver.quit();
		List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(list.size());
		//webElement.findElement("");
		for(int i =0;i<list.size();i++) {
			//to split the text we want
			String[] name=list.get(i).getText().split("-");
			//to trim the if it has any spaces
			String formattedName = name[0].trim();
			
			System.out.println(formattedName); 
			List neededVeggie =Arrays.asList(veggie);
			
			if(neededVeggie.contains(formattedName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		
		//driver.quit();

	}

}
