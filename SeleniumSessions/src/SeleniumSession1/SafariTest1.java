package SeleniumSession1;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;

public class SafariTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		
		driver.get("https://www.Google.com");
			
		String title = driver.getTitle();
		

	}

}
