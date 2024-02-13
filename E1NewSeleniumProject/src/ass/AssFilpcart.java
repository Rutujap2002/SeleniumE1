package ass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssFilpcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement click = driver.findElement(By.xpath("//input[@name='q']"));
		click.sendKeys("HP Laptop");
		Thread.sleep(1000);
		
		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();
		Thread.sleep(1000);
		
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brand']"));
		brand.click();
		
		WebElement Hp = driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::div[@class='_24_Dny']"));
		Hp.click();
		
	
		List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> laptopprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		  
		for(int i=0;i<laptop.size();i++)
		{
		String lp = laptop.get(i).getText();
		
		for(int j=i;j<=i;j++)
		{
			String lpp = laptopprice.get(i).getText();
			System.out.println(lp+".........."+lpp);
			
		}
		}
		

	}
	

}
