package methodsOFWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		//to launch chrome browser
		WebDriver driver = new ChromeDriver();
		//to stop the execution for 5 sec
		Thread.sleep(5000);
		//to close the browser window.
		driver.close();

	}

}
