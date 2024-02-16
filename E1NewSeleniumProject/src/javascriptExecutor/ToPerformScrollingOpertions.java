package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingOpertions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//to perform scroll down 
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500);");
	}

}
