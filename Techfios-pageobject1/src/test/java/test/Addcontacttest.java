package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.Addcontact;
import page.Homepage;
import page.Loginpage;
import util.BrowserFactory;

public class Addcontacttest {
	
	
@Test
@Parameters({"Loginemail", "Password", "Name","Company", "Email", "Phone", "Address", "City", "State", "Zip"})

public void AddingContact(String Loginemail,String Password, String Name, String Company, String Email,String Phone,String Address, String City, String State, String Zip){
	

WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login");


Loginpage logintotechfios = PageFactory.initElements(driver,Loginpage.class);

logintotechfios.Login(Loginemail, Password);

Homepage home= PageFactory.initElements(driver, Homepage.class);
	
home.NavigateToAddContact();

Addcontact contact = PageFactory.initElements(driver,Addcontact.class );	
	
contact.FillingUpAddressForm(Name, Company, Email, Phone, Address, City, State, Zip);

driver.close();
driver.quit();

}

	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


