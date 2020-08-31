package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public BrowserFactory() {
		
	}
	
	public WebDriver startBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.Geco.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.internetexplorer.driver", "path of ie driver");
			driver = new InternetExplorerDriver();
		}
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://mrbool.com");
		 return driver;
	}
}
