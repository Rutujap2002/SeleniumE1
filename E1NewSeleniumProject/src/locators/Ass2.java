package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		 WebElement usnTextbox =driver.findElement(By.name("username"));
		 usnTextbox.sendKeys("rutuja_rajput_03");
		 Thread.sleep(2000);
		 WebElement passTextbox =driver.findElement(By.name("password"));
		 passTextbox.sendKeys("12345");
		 Thread.sleep(2000);
		 WebElement loginButton =driver.findElement(By.tagName("input"));
		 loginButton.click();

	}

}
