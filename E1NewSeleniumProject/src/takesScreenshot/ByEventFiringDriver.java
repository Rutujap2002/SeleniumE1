package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringDriver {

	public static void main(String[] args) throws IOException {
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		 File src = efwd.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshots/instagram.png");
		 Files.copy(src, dest);

	}

}
