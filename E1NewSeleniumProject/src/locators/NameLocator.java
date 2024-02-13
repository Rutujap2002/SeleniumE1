package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		 WebElement usnTextbox =driver.findElement(By.name("email"));
		 usnTextbox.sendKeys("rutuja_rajput_03");
		 Thread.sleep(2000);
		 WebElement passTextbox =driver.findElement(By.name("pass"));
		 passTextbox.sendKeys("Aaru2002");
		 WebElement loginButton =driver.findElement(By.name("login"));
		 loginButton.click();
		 
	}

}
