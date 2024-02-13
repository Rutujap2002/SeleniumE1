package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(5000);
		//WebElement signLink = driver.findElement(By.partialLinkText("Sign In"));
		//]]signLink.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("rutujakpawar@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='mui-2']"));
		password.sendKeys("Rutu@2002");
		WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		

	}

}
