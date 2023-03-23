package Technical_Task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Answer_3 
{
	public static void main(String[] args) 
	{
		//Cross Browser Testing with different Methods
		//Launching Edge Browser with WebDriver
		System.setProperty("webdriver.edge.driver","C:\\Eclipse\\Automation\\Driver\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.google.com/");
		
		//Launching Chrome Browser with ChromeOptions
		ChromeOptions options1=new ChromeOptions();
		options1.addArguments("--remote-allow-origins=*");
		WebDriver driver2=new ChromeDriver(options1);
		driver2.get("https://www.google.com/");
		
		//Launching Firefox Browser with FirefoxOptions
		FirefoxOptions options2=new FirefoxOptions();
		WebDriver driver3=new FirefoxDriver(options2);
		driver3.get("https://www.google.com/");
		
		//Launching Browser using WebDriverAPI Manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver4=new ChromeDriver(options1);
		driver4.get("https://www.google.com/");
	}
}
