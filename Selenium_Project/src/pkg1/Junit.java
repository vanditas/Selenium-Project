package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Junit {


    @Before
    public void b()
	{
		System.out.println("Before");
		
	}
    @Test
    public void test()
    
    {
    	System.out.println("Test");
    	
    }
    @After
    public void a()
    {
    	System.out.println("After");
    }


}

