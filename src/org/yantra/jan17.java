package org.yantra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jan17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up the Driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Yantra\\driver\\chromedriver.exe");
				
				//Launch the Browser
				WebDriver driver = new ChromeDriver();
				
				//Go to the URL
				driver.get("https://192.168.1.161:1880");
	}

	
}
