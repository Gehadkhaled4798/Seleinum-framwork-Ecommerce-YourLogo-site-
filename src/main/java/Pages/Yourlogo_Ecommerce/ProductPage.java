package Pages.Yourlogo_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage extends Utilit_Function {
	Actions action;
	private String P_name;
	private WebElement productElement;
	private By productbutton;
	private By FriendEmail=By.id("friend_email");
	private By Friendname=By.id("friend_name");
	private By SendProduct=By.id("sendEmail");
	private By friend_button=By.id("send_friend_button");
	private By SuccessSend=By.cssSelector("div.fancybox-inner> p");
	private By OkButton=By.cssSelector("div.fancybox-inner> p.submit> input");
	
	public ProductPage(WebDriver div,String Prodctname)
	{
		super(div);
		action = new Actions(div);
		P_name=Prodctname;
		productElement=div.findElement(By.linkText(P_name));
		productbutton=By.linkText(P_name);
	}
	
	public void productClickToOpen()
	{
		action.moveToElement(productElement).build().perform();
		ButtonclickOn(productbutton);
	}
	
	private String VerifyIsSentToFriend()
	{
		return driver.findElement(SuccessSend).getText();
	}
	
	public String SendToFriends(String name,String F_Mail)
	{
		ButtonclickOn(friend_button);
		SetTextbox(FriendEmail, F_Mail);
		SetTextbox(Friendname, name);
		ButtonclickOn(SendProduct);
		String Verify=VerifyIsSentToFriend();
		ButtonclickOn(OkButton);
		return Verify;
	}
}
