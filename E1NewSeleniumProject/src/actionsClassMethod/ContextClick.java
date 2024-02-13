package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Actions act = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
         act.click(button).perform();
		WebElement rightclick = driver.findElement(By.partialLinkText("Right Click"));
		act.click(rightclick).perform();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn30']"));
		act.contextClick(button1).perform();
       WebElement button1option = driver.findElement(By.xpath("//div[text()='Yes']"));
       act.click(button1option).perform();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@id='btn31']"));
		act.contextClick(button2).perform();
		 WebElement button2option = driver.findElement(By.xpath("//div[text()='No']"));
		 act.click(button2option).perform();
			
		WebElement button3 = driver.findElement(By.xpath("//button[@id='btn32']"));
		act.contextClick(button3).perform();
		WebElement button3option = driver.findElement(By.xpath("//div[text()='5']"));
		act.click(button3option).perform();
	}
	
	

}
