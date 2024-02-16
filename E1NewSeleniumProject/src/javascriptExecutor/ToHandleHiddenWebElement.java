package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement hiddenEle = driver.findElement(By.xpath("//input[@name=\"custom_gender\"]"));
		//hiddenEle.sendKeys("QSp");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='QSP'", hiddenEle);
	}

}
,.///.