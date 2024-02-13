package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rutuj/OneDrive/Desktop/WebElements/Textbox.html");
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.className("textBox"));
		textBox.sendKeys("manager");
		


	}
	

}
