package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MMT_Project {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.id("hp-widget__sfrom"));
		a.sendKeys(Keys.DOWN).click(from).perform();
		
		System.out.println("Welcome");
		
	}

}
