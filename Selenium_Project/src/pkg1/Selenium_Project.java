package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Project {
	public static void main(String[] args) {
	    Selenium_Project obj= new Selenium_Project();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Firstname=driver.findElement(By.id("u_0_j"));
		Firstname.sendKeys("Vandita");
		WebElement Lastname=driver.findElement(By.id("u_0_l"));
		Lastname.sendKeys("Sharma");
		WebElement Mobile = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		Mobile.sendKeys("0987654321");
		WebElement NewPassword = driver.findElement(By.id("u_0_v"));
		NewPassword.sendKeys("7638938930");
	    WebElement Day = driver.findElement(By.id("day"));
		obj.dropdownselection(Day,"28");
	    //Select s = new Select(Day);
		//s.selectByValue("29");
		WebElement month=driver.findElement(By.id("month"));
		obj.dropdownselection(month, "Jan");
		//Select s1 = new Select(month);
		//s1.selectByIndex(1);
		WebElement year = driver.findElement(By.id("year"));
		obj.dropdownselection(year,"2018");
		//Select s2 = new Select(year);
		//s2.selectByVisibleText("2016");
		WebElement Gender = driver.findElement(By.cssSelector("label[for='u_0_9']"));
		Gender.click();
		WebElement SignUp = driver.findElement(By.id("u_0_11"));
		SignUp.click();
	}
		
		public void dropdownselection(WebElement element, String visibleText)
		{
			Select s = new Select(element);
			s.selectByVisibleText(visibleText);
		}
		
		
 }


