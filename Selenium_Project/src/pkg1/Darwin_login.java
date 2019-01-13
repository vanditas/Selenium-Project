package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Darwin_login {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ssl2.perquisite.net/AdminWeb/login.aspx");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.id("txtUsername"));
		Username.sendKeys("vandita.sharma");
		WebElement submit = driver.findElement(By.id("btnSubmit_btnButton"));
		submit.click();
		Thread.sleep(5000);
	    WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys("Dec2018@");
		//Memorable Code
		int a[] = {2,9,1,1,9,3};
		String str = driver.findElement(By.id("MemorableCodeCharacter0")).getText();
		int code1= Integer.parseInt(str.substring(10));		
		WebElement dd1 = driver.findElement(By.id("ddMemorableCode0_ddList"));
		Select s = new Select(dd1);
		s.selectByIndex(a[code1-1]+1);
        //System.out.println(a[code1-1]);
		String str1 = driver.findElement(By.id("MemorableCodeCharacter1")).getText();
		int code2 = Integer.parseInt(str1.substring(10));
		WebElement dd2 = driver.findElement(By.id("ddMemorableCode1_ddList"));
		Select s1 = new Select(dd2);
		s1.selectByIndex(a[code2-1]+1);
		//System.out.println(a[code2-1]);
		String str2 = driver.findElement(By.id("MemorableCodeCharacter2")).getText();
		int code3= Integer.parseInt(str2.substring(10));		
		WebElement dd3 = driver.findElement(By.id("ddMemorableCode2_ddList"));
		Select s2 = new Select(dd3);
		s2.selectByIndex(a[code3-1]+1);
		WebElement submit_final= driver.findElement(By.id("btnSubmit_btnButton"));
		submit_final.click();
		
	
	}

}
