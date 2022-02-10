package Pages.Yourlogo_Ecommerce;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseRun {
	HomePage Pages;
	RegisterDataPage User;
	AuthenticationPage signin;
	ProductPage Product;
	
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
	  		  Pages=new HomePage(driver);
	  	      Pages.Rigester();
			  signin=new AuthenticationPage(driver);
			  signin.UserLogin("Gehadkh@gmail.com","00000");
			  Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
			   Pages.OpenProductPage();
			   Pages.Searchproduct(Productname);
			   Product=new ProductPage(driver, Productname);
			   Product.productClickToOpen();
			  String Message= Product.SendToFriends(Friendname, Friendmail);
			   Assert.assertEquals(Message,"Your e-mail has been sent successfully");
			   signin.signout();
	  }
}
