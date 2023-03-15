package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Demo 
{
	WebDriver dr = null;
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("Test1 Execution "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		Thread.sleep(2000);
		dr.close();
	}@Test
	public void test2() throws InterruptedException
	{
		System.out.println("Test2 Execution "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.get("https://www.youtube.com/");
		Thread.sleep(2000);
		dr.close();
	}
}
