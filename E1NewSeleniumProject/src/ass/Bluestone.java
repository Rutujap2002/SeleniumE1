package ass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Bluestone {

	public static void main(String[] args) throws IOException {
			 ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.id("denyBtn")).click();
			WebElement coin = driver.findElement(By.xpath("//a[text()='Coins '] "));
			Actions act = new Actions(driver);
			TakesScreenshot ts=(TakesScreenshot)driver;
			act.moveToElement(coin).perform();
			 driver.findElement(By.xpath("//span[text()='1 gram'][1]")).click();
			 WebElement ele = driver.findElement(By.xpath("//a[@id='5920']"));
			 if(ele.isDisplayed())
			 {
				 File src = ts.getScreenshotAs(OutputType.FILE);
				 File dest = new File("./screenshots/bluestone.png");
				 Files.copy(src, dest);

			 }
			 else {
				 System.out.println("Not Found");
			 }
			
			
	}

}
