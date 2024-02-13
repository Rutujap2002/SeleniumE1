package methodsOFWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");//to launch browser
	    Thread.sleep(1000);
        driver.navigate().back();//to navigate backword
        Thread.sleep(1000);
        driver.navigate().forward();// to navigate forword
        Thread.sleep(1000);
        driver.navigate().refresh(); //to refresh
       
        
	}

}
