package SeleniumSession1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shard\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://html.com/input-type-file/");
			driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\shard\\Downloads\\TestFramework13102018\\TestFramework\\test-output\\index.HTML");
			
			
			
		}


	}


