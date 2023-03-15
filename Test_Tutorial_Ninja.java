package Maven_TestNG_Project.Project_1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Test_Tutorial_Ninja 
{
	WebDriver dr = null;
  @Test(priority=0)
  public void webpage_verification()
  {
	  String Webpage_Title = dr.getTitle();
	  Assert.assertEquals(Webpage_Title,"Your Store");
  }
  @Test(priority=1)
  public void registerationpage_shifting()
  {
	  dr.findElement(By.xpath("//a[@title='My Account']")).click();
	  dr.findElement(By.xpath("//a[text()='Register']")).click();
	  String Registerpage_Title = dr.getTitle();
	  Assert.assertEquals(Registerpage_Title,"Register Account");
  }
  @Test(priority=2)
  public void clearing_details()
  {
	  dr.findElement(By.id("input-firstname")).clear();
	  dr.findElement(By.id("input-lastname")).clear();
	  dr.findElement(By.id("input-email")).clear();
	  dr.findElement(By.id("input-telephone")).clear();
	  dr.findElement(By.id("input-password")).clear();
	  dr.findElement(By.id("input-confirm")).clear();
	  boolean radio_button =  dr.findElement(By.xpath("//input[@name='newsletter']")).isSelected();
	  System.out.println("Radio Button Status = "+radio_button);
	  boolean checkbox =  dr.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
	  System.out.println("Check Box Status = "+checkbox);
  }
  @Test(priority=3)
  public void entering_details()
  {
	  dr.findElement(By.id("input-firstname")).sendKeys("Saravanan");
	  dr.findElement(By.id("input-lastname")).sendKeys("Devaraj");
	  dr.findElement(By.id("input-email")).sendKeys("saravanandr010@gmail.com");
	  dr.findElement(By.id("input-telephone")).sendKeys("9566899867");
	  dr.findElement(By.id("input-password")).sendKeys("Saransdr@010");
	  dr.findElement(By.id("input-confirm")).sendKeys("Saransdr@010");
	  boolean radio_button =  dr.findElement(By.xpath("//input[@name='newsletter']")).isSelected();
	  System.out.println("Radio Button Status = "+radio_button);
	  if(!(dr.findElement(By.xpath("//input[@name='newsletter']")).isSelected()))
	  {
		  dr.findElement(By.xpath("(//input[@value='1'])[2]")).click();
	  }
	  boolean checkbox =  dr.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
	  System.out.println("Check Box Status = "+checkbox);
	  if(!(dr.findElement(By.xpath("//input[@type='checkbox']")).isSelected()))
	  {
		  dr.findElement(By.xpath("(//input[@value='1'])[3]")).click();
	  }
	  dr.findElement(By.xpath("//input[@type='submit']")).click();
  }
  @BeforeClass(alwaysRun=true)
  @Parameters("browser")
  public void beforeClass(String browser) 
  {
//	  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Project_1\\Driver\\chromedriver.exe");
//	  dr = new ChromeDriver();
	  //Chrome Driver from WebDriverManager
//	  WebDriverManager.chromedriver().setup();
//	  dr=new ChromeDriver();
//	  WebDriverManager.edgedriver().setup();
//	  dr = new EdgeDriver();
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  dr=new ChromeDriver();		  
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
     	  WebDriverManager.edgedriver().setup();
 		  dr = new EdgeDriver();  
	  }
	  dr.get("http://tutorialsninja.com/demo/index.php?route=common/home");
  }
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("The Registeration Process is Completed");
  }
}
