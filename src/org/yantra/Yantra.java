package org.yantra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yantra {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set up the Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Yantra\\driver\\chromedriver.exe");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Go to the URL
		driver.get("https://demo.yantra24x7.com ");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//To get the Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//To get the Currernt URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);
		
		//TextUsername
		WebElement textUsername = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		textUsername.sendKeys("admin@gmail.com");
		
		Thread.sleep(3000);
		
		//TextPassword
		WebElement textPassword = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		textPassword.sendKeys("Admin@123#");
		
		Thread.sleep(3000);
		
		//Login
		WebElement btnLogin = driver.findElement(By.xpath("//span[text()='Login']"));
		btnLogin.click();
		
		Thread.sleep(3000);
		
		//Navigate-Refresh
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		//Logout
        //WebElement clkLogout = driver.findElement(By.xpath("//span[@class='material-icons']"));
        //clkLogout.click();
        
		//Thread.sleep(3000);
        
        //ClickLogout
        //WebElement clckLgout = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        //clckLgout.click();
		
		//Efficiency-Report
		WebElement EfficiencyReport = driver.findElement(By.xpath("//span[text()='Efficiency Report']"));
		EfficiencyReport.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Efficiency Title
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		//To get the Efficiency Url
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		//General-Report 
		WebElement generalReport = driver.findElement(By.xpath("//span[text()='General Report']"));
		generalReport.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the General Title
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		//To get the General URL
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		
		//Idle-Reason-Report
		WebElement idleReasonreport = driver.findElement(By.xpath("//span[text()='Idle Reason Report']"));
		idleReasonreport.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Idle Title
		String title4 = driver.getTitle();
		System.out.println(title4);
		
		//To get the Idle URL
		String url4 = driver.getCurrentUrl();
		System.out.println(url4);
		
	    //Compare-Chart
		WebElement compareChart = driver.findElement(By.xpath("//span[text()='Compare chart']"));
		compareChart.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//To get the Compare Title
		String title5 = driver.getTitle();
		System.out.println(title5);
		
		//To get the Compare URL
		String url5 = driver.getCurrentUrl();
		System.out.println(url5);

		//Cycle-Time-Chart
		WebElement cycleTimechart = driver.findElement(By.xpath("//span[text()='Cycle Time chart']"));
		cycleTimechart.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Current Title
		String title6 = driver.getTitle();
		System.out.println(title6);
		
		//To get the Current Time Chart URL
		String url6 = driver.getCurrentUrl();
		System.out.println(url6);
		
		//Alarms
		WebElement alaRms = driver.findElement(By.xpath("//span[text()='Alarms']"));
		alaRms.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Alarms Title
		String title7 = driver.getTitle();
		System.out.println(title7);
		
		//To get the Alarms URL
		String url7 = driver.getCurrentUrl();
		System.out.println(url7);
		
		//Quality-Entry
		WebElement qualityEntry = driver.findElement(By.xpath("//span[text()='Quality Entry']"));
		qualityEntry.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Quality Title
		String title8 = driver.getTitle();
		System.out.println(title8);
		
		//To get the Quality URL
		String url8 = driver.getCurrentUrl();
		System.out.println(url8);
		
		//Machine
		WebElement MacHine = driver.findElement(By.xpath("//span[text()='Machine']"));
		MacHine.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Machine Title
		String title9 = driver.getTitle();
		System.out.println(title9);
		
		//To get the Machine URL
		String url9 = driver.getCurrentUrl();
		System.out.println(url9);
		
		//Shift
		WebElement shiFt = driver.findElement(By.xpath("//span[text()='Shift']"));
		shiFt.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Shift Title
		String title10 = driver.getTitle();
		System.out.println(title10);
		
		//To get the Shift URL
		String url10 = driver.getCurrentUrl();
		System.out.println(url10);
		
		//User
		WebElement uSer = driver.findElement(By.xpath("//span[text()='User']"));
		uSer.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the User Title
		String title11 = driver.getTitle();
		System.out.println(title11);
		
		//To get the User URL
		String url11 = driver.getCurrentUrl();
		System.out.println(url11);
		
		//Route-Card
		WebElement routeCard = driver.findElement(By.xpath("//span[text()='Route Card']"));
		routeCard.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Route Title
		String title12 = driver.getTitle();
		System.out.println(title12);
		
		//To get the Route URL
		String url12 = driver.getCurrentUrl();
		System.out.println(url12);
		
		//Operator
		WebElement operaTor = driver.findElement(By.xpath("//span[text()='Operator']"));
		operaTor.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//To get the Operator Title
		String title13 = driver.getTitle();
		System.out.println(title13);
		
		//To get the Operator URL
		String url13 = driver.getCurrentUrl();
		System.out.println(url13);
		
		//Reason
		WebElement reaSon = driver.findElement(By.xpath("//span[text()='Reason']"));
		reaSon.click();
        Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//To get the Reason Title
		String title14 = driver.getTitle();
		System.out.println(title14);
		
		//To get the Reason URL
		String url14 = driver.getCurrentUrl();
		System.out.println(url14);
		
		//New-Update
		//ScrollDown
		WebElement scrollDashboard = driver.findElement(By.xpath("//span[text()='M-DashBoard']"));
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView('true')", scrollDashboard);
				
		Thread.sleep(3000);
				
		//Click-M-Dashboard
		WebElement textMdashboard = driver.findElement(By.xpath("//span[text()='M-DashBoard']"));
		textMdashboard.click();
		//Text-M-Dashboard-Title
		String title15 = driver.getTitle();
		System.out.println(title15);
		//Text-M-Dashboard-URL
		String url15 = driver.getCurrentUrl();
		System.out.println(url15);
				
		Thread.sleep(3000);
				
		//TextTrendchart
		WebElement textTrendchart = driver.findElement(By.xpath("//span[text()='Trend Chart']"));
		textTrendchart.click();
		//Text-Trendchart-Title
		String title16 = driver.getTitle();
		System.out.println(title16);
		//Text-Trendchart-URL
		String url16 = driver.getCurrentUrl();
		System.out.println(url16);
				
				
		Thread.sleep(3000);
				
		//TextM-machine
	    WebElement textMmachine = driver.findElement(By.xpath("//span[text()='M-Machine']"));
		textMmachine.click();
		//TextM-Machine-Title
		String title17 = driver.getTitle();
		System.out.println(title17);
		//TextM-Machine-URL
		String url17 = driver.getCurrentUrl();
		System.out.println(url17);
				
		Thread.sleep(5000);
		
		//Logout
		WebElement clkLogout = driver.findElement(By.xpath("//span[@class='material-icons']"));
		clkLogout.click();
		        
	    Thread.sleep(3000);
		        
		//Click Logout
        WebElement btnLogut = driver.findElement(By.xpath("(//button[@type=\"button\"])[16]"));				
        btnLogut.click();
				
		
		
		   //Scroll-Down
		   //WebElement scrollDown = driver.findElement(By.xpath("//span[text()='M-Machine']"));
		   //JavascriptExecutor jk = (JavascriptExecutor) driver;
		   //jk.executeScript("arguments[0].scrollIntoView(true)",scrollDown );
		
		   //Thread.sleep(3000);
		
		   //M-Dashboard
		   //WebElement mDashboard = driver.findElement(By.xpath("//span[text()='M-DashBoard']"));
		   //mDashboard.click();
		   //Thread.sleep(2000);
		   //driver.navigate().refresh();
		   //Thread.sleep(2000);
		
		   //To get the M-Dashboard Title
		   //String title15 = driver.getTitle();
		   //System.out.println(title15);
		
		   //To get the M-Dashboard URL
		   //String url15 = driver.getCurrentUrl();
		   //System.out.println(url15);
		
		   //Trend-Chart
		   //WebElement trendChart = driver.findElement(By.xpath("//span[text()='Trend Chart']"));
		   //trendChart.click();
		   //Thread.sleep(2000);
		   //driver.navigate().refresh();
		   //Thread.sleep(2000);
		
		   //M-Machine
		   //WebElement mMachine = driver.findElement(By.xpath("//span[text()='M-Machine']"));
		   //mMachine.click();
		   //Thread.sleep(2000);
		   //driver.navigate().refresh();
		   //Thread.sleep(2000);
		
		   //Logout
           //WebElement clkLogout = driver.findElement(By.xpath("//span[@class='material-icons']"));
           //clkLogout.click();
        
		   //Thread.sleep(3000);
        
           //ClickLogout
           //WebElement clckLgout = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
           //clckLgout.click();
		
	
                
	}

}
