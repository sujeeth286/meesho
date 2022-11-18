package meesho;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class practice 
{
	public static void main(String[] args) throws InterruptedException {
		slideover();
		scroll();
		search();
		
	}
	public static void slideover() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.meesho.com");
		Thread.sleep(6000);
		WebElement address = driver.findElement(By.xpath("//span[.='Bags & Footwear']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		act.moveToElement(address).perform();
		
		
	}
	public static void scroll() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.meesho.com");
		Thread.sleep(6000);
		//SCROLL DOWN ACTION
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//SCROLL UP ACTION
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		
		
		
	}
	public static void search() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.meesho.com");
		Thread.sleep(6000);
		 WebElement address = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
			address.sendKeys("silk saree");
			Thread.sleep(2000);
			
			address.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='https://images.meesho.com/images/products/5524243/1_400.jpg']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Add to Cart']")).click();
			
			
	}

 }
