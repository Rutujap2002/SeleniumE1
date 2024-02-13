package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Log in']"));
		File src = loginbutton.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshots/loginbutton.png");
		 Files.copy(src, dest);

		
	}

}
