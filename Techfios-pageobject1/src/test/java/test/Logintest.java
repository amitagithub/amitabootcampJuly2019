package test;


	
	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Loginpage;
import util.BrowserFactory;

public class Logintest {
	
@Test	//junit or Testng annotation

public void TechfiosLogintest(){

	
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login");


Loginpage logintotechfios = PageFactory.initElements(driver,Loginpage.class);

logintotechfios.Login("techfiosdemo@gmail.com","abc123");

driver.close();

driver.quit();
	
	
	
	
	
	
	
}
	
	

}
