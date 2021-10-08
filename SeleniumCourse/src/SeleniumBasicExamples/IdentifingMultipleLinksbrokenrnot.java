package SeleniumBasicExamples;

import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class IdentifingMultipleLinksbrokenrnot {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//pavani//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a= new SoftAssert();
		for(WebElement link:links)
			
		{
			String url=link.getAttribute("href");
			System.out.println(url);
			URL Url = new URL(url);

			URLConnection conn = Url.openConnection();

			if (conn instanceof HttpsURLConnection) {

			  HttpsURLConnection conn1 = (HttpsURLConnection) Url.openConnection();
			  
			  conn1.setHostnameVerifier(new HostnameVerifier() {
			    public boolean verify(String hostname, SSLSession session) {
			      return true;
			    }
			  });

			 
			//reply.load(conn1.getInputStream());
			//HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			//conn.setRequestMethod("HEAD");
			//conn.connect();
			int result=conn1.getResponseCode();
			System.out.println(result);
			//soft assertion go through all steps
			a.assertTrue(result<400, "The link with text:" +link.getText()+"The related resopnse" +result);
			
		
		if(result>400) {
			System.out.println("The link with text:" +link.getText()+"The related resopnse" +result);
			Assert.assertTrue(false);
		}
		}
		}

	}
}

	


