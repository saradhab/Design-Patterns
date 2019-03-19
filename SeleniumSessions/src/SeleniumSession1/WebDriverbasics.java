package SeleniumSession1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shard\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		
		String title = driver.getTitle();
				
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			
			System.out.println("incorrect title");
		}
	
		System.out.println(driver.getCurrentUrl());
			
		driver.quit();
		
	}

}
