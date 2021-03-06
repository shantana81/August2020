package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.PreorderPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Bhpreorder {
	WebDriver driver;
	@Given("^user open the homepage$")
	public void user_open_the_homepage() throws Throwable {
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//"driver name","path of driver"
		  driver = new ChromeDriver();
		  
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   //how to open url?
		  driver.get("https://www.bhphotovideo.com");
		  Thread.sleep(4000);
		}
		catch(Exception e) {
			System.out.println("browser or url not opening");
		}
	}
	
	@When("^use clicks third dot in slideshow$")
	public void use_clicks_third_dot_in_slideshow() throws Throwable {
	   try {
		   PreorderPOM obj1 = new PreorderPOM(driver);
		   obj1.dot().click();
		   
	   } catch (Exception e) {
		   System.out.println("The dot thingy is not working");
	   }
	}

	@When("^user click preorder$")
	public void user_click_preorder() throws Throwable {
		try {
			PreorderPOM obj1=new PreorderPOM(driver);
			obj1.preorder().click();
		}
		catch (Exception e) {
			System.out.println("Button is not working");
		}
	}

	@Then("^user can successfully goes to the preorder page$")
	public void user_can_successfully_goes_to_the_preorder_page() throws Throwable {
	    
	}



}
