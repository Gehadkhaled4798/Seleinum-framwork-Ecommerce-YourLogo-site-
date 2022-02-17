package Pages.Yourlogo_Ecommerce;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SendProductToFriendTest extends BaseRun {
	ProductPage Product;
	AuthenticationPage signin;
	YourAccountPage Account;		
	@DataProvider(name="SearchData")
	public static Object[][] SearchData()
	{
		return new Object[][] {
			{"Printed Dress","Zead","Zead@Gmail.com" },
			{"Blouse","Asmaa","Asmaa@gmail.com"}
		};
	}
	
  @Test(dataProvider ="SearchData" )
	  public void SendProductToFriends( String Productname,String Friendname,String Friendmail) 
	  		{
	  			signin=homePage.Rigester();
	  			Account= signin.UserLogin("Gehadkh@gmail.com","00000");
			   Product=homePage.Searchproduct(Productname);
			   Product.productClickToOpen();
			   String Message= Product.SendToFriends(Friendname, Friendmail);
			   Assert.assertEquals(Message,"Your e-mail has been sent successfully");
	  		}
}
