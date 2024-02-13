package ass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragandDrp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/u/rutujapawar14/boards");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("rutujakpawar@gmail.com");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rutuja@2002");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='E1']")).click();
		   
		WebElement javas = driver.findElement(By.xpath("//a[text()='java']"));
		WebElement Sqls = driver.findElement(By.xpath("//a[text()='Sql']"));
		WebElement manuals = driver.findElement(By.xpath("//a[text()='Manual testing']"));
		WebElement APIs = driver.findElement(By.xpath("//a[text()='API']"));
		WebElement seleniums = driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		WebElement mockgivenTarget = driver.findElement(By.xpath("//textarea[text()='mock given']"));
		WebElement mockpendingTarget = driver.findElement(By.xpath("//textarea[text()='mock pending']"));
		WebElement mockscheduleTarget = driver.findElement(By.xpath("//textarea[text()='mock schedule']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Sqls, mockscheduleTarget).perform();
		act.dragAndDrop(APIs, mockpendingTarget).perform();
		act.dragAndDrop(manuals, mockgivenTarget).perform();
		act.dragAndDrop(javas, mockgivenTarget).perform();
		act.dragAndDrop(seleniums, mockscheduleTarget).perform();
		
		List<WebElement> list = driver.findElements(By.xpath("//button[@class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']"));
		for(WebElement we:list)
		{
			System.out.println(we.getText());
		}
		
		
	}

}
