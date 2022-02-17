package Pages.Yourlogo_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterDataPage extends Utilit_Function {
   private By FristName=By.id("customer_firstname");
	private By LastName=By.id("customer_lastname");
	private By password=By.id("passwd");
	private By address1 =By.id("address1");
	private By City =By.id("city");
	private By postcode =By.id("postcode");
	private By phone_mobile =By.id("phone_mobile");
	private By Assignsdress =By.id("alias");
	private By State =By.id("id_state");
	private By Country =By.id("id_country");
	private By submit =By.id("submitAccount");
	//private By Signout=By.linkText("Sign out");
	private WebDriver driver;
	
	public RegisterDataPage(WebDriver div) {
		super(div);
		this.driver=div;
	}
	
	public String RegisterPageOpened()
	{
		return driver.findElement(By.id("authentication")).getText();
	}
	
	public YourAccountPage RegisteraiondataData(String Frist,String last,String passwd,String address,String city_,int stat
			,String Pcode,int countr,String mobile,String Assignadr)
	{
		SetTextbox(FristName, Frist);
		SetTextbox(LastName, last);
		SetTextbox(password, passwd);
		SetTextbox(address1, address);
		SetTextbox(City,city_);
		selectstate(stat);
		SetTextbox(postcode, Pcode);
		selectCountry(countr);
		SetTextbox(phone_mobile, mobile);
		SetTextbox(Assignsdress, Assignadr);
		ButtonclickOn(submit);
		return new YourAccountPage(driver);
	}
	
	private void selectstate(int index)
	{
		ButtonclickOn(State);
		Select choice= new Select(driver.findElement(State));
		choice.selectByIndex(index);
	}
	private void selectCountry(int index)
	{
		ButtonclickOn(State);
		Select choice= new Select(driver.findElement(Country));
		choice.selectByIndex(index);
	}
	
}
