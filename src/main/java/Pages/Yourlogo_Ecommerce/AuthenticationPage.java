package Pages.Yourlogo_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends Utilit_Function {
	private By MailText=By.id("email_create");
	private By CreateAccountButton=By.id("SubmitCreate");
	private By Username=By.id("email");
	private By Passwordloc= By.id("passwd");
	private By loginbutton=By.id("SubmitLogin");
	//private By Signout=By.linkText("Sign out");
	private WebDriver driver;
	
	public AuthenticationPage(WebDriver div)
	{
		super(div);
		this.driver=div;
	}

	public RegisterDataPage RegisterUser(String EAddress)
	{
		SetTextbox(MailText, EAddress);
		ButtonclickOn(CreateAccountButton);
		return new RegisterDataPage(driver);
	}
	
	public YourAccountPage UserLogin(String UserEmail,String Password)
	{
		SetTextbox(Username, UserEmail); 
		SetTextbox(Passwordloc, Password);
		ButtonclickOn(loginbutton);
		return new YourAccountPage(driver);
	}
}

