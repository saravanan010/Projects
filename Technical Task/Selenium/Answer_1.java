//Handling Multiple Windows
package Technical_Task;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
public class Answer_1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:\\Eclipse\\Automation\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//Single Window
		driver.get("https://www.google.com/");
		String Home_Page=driver.getWindowHandle();
		System.out.println("Home Main Page in the Browser = "+Home_Page);
		//Multiple Windows
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.gmail.com/");
		Set <String> All_Pages=driver.getWindowHandles();
		System.out.println("All Pages in the Browser = "+All_Pages);
	}
}
