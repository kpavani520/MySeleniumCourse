package SeleniumBasicExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TraversingToDynamicSiblingAndParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/Flights?langid=1033&semcid=US.MULTILOBF.GOOGLE.GT-c-EN.FLIGHT&semdtl=a1355852835.b150547147990.r1ec5e1ba484cae618a17497a3992b8ba7bb5fd571e8325d68c1ba75a5d00048f2.g1kwd-843533088.i1.d1280328931023.e1c.j19030961.k1.f1.n1.l1g.h1e.m1&gclid=Cj0KCQjws4aKBhDPARIsAIWH0JW1fDs6Npg5rARMX9aNZDEsV10eWLPAjeDnjCJmIxYeW7HtBtuIEccaApjZEALw_wcB");
		//traversing to the next dynamic sibling:
		//driver.findElement(By.xpath("//li[@role = 'presentation']/following-sibling::li[2]")).click();
		//traversing back to dynamic parent:
		System.out.println(driver.findElement(By.xpath("//li[@role = 'presentation']/parent::div")).getAttribute("class"));
		

	}

}
