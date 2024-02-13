package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rutuj/OneDrive/Desktop/WebElements/Textbox.html");
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.tagName("input"));
		textBox.sendKeys("manager");
		
	}

}
