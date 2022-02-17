package Pages.Yourlogo_Ecommerce;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogInTest extends BaseRun {
	AuthenticationPage signin;
	YourAccountPage Account;
	//LogIn test and Data
	  @DataProvider(name="LoginData")
		public static Object[][] userData()
		{
			return new Object[][] {
				{"Gehadkh@gmail.com","00000"},
				//{"Geh@gmail.com","11111"}
			};
		}
	  
	  @Test(dataProvider="LoginData")
	  public void UserloginTest(String Usermail,String Pass) 
	  {
		  signin=homePage.Rigester();
		  Account= signin.UserLogin(Usermail, Pass);
		  Assert.assertTrue(Account.VerfiyYourAccountOpen().contains("Welcome to your account"));
	  }
}