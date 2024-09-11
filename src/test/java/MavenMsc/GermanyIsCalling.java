package MavenMsc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GermanyIsCalling 
{
	WebDriver driver;
	  @Test
	  public void Browser() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Driver\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origiins=*");
			 driver=new ChromeDriver(co);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			driver.get("https://app.germanyiscalling.com/common/login/");
			Thread.sleep(2000);
	  }
	  @Test
	  public void LoginSuccefull() throws InterruptedException
	  {
		  driver.findElement(By.id("username")).sendKeys("sohelpathan5110@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.id("password")).sendKeys("Sohel@1234");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  
		 }
	  @Test
	  public void Logout() throws InterruptedException
	  {
		  driver.findElement(By.linkText("Sohel Pathan")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Logout")).click();
	  }
	  @Test
	  public void UnSuccefull() throws InterruptedException
	  {
		  driver.findElement(By.id("username")).sendKeys("sohelpathan5110@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.id("password")).sendKeys("Sohel@123467");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  
		 }
	  
	  
	  

}
