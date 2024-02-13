package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rutuja/login.do");
		Thread.sleep(2000);
		 WebElement usnTextbox =driver.findElement(By.name("username"));
		 usnTextbox.sendKeys("admin");
		 Thread.sleep(2000);
		 WebElement passTextbox =driver.findElement(By.name("pwd"));
		 passTextbox.sendKeys("manager");
		 Thread.sleep(2000);
		 WebElement loginButton =driver.findElement(By.className("initial"));
		 loginButton.click();
		 

	}

}
