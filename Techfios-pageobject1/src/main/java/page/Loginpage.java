package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	
	
	WebDriver driver;  //Global variable
	
	
	public Loginpage(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
		
	@FindBy(how=How.ID,using="username")
	WebElement Email;

	@FindBy(how=How.ID,using="password")
	WebElement Password;
		
	@FindBy(how=How.NAME,using="login")
	WebElement SignInButton;


	public void Login(String email, String password) {
		
		Email.sendKeys(email);
		Password.sendKeys(password);
		SignInButton.click();
	}



	}

	
	
	
	
	
	


