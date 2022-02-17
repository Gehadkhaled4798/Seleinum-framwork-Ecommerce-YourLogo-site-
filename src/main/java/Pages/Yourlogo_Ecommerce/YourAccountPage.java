package Pages.Yourlogo_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class YourAccountPage {

	private WebDriver driver;
	private By VerifyMessage=By.className("info-account");
	public YourAccountPage(WebDriver dri) {
		// TODO Auto-generated constructor stub
		  this.driver=dri;
	}

	public String VerfiyYourAccountOpen()
	{
		return  driver.findElement(VerifyMessage).getText();
	}
}
