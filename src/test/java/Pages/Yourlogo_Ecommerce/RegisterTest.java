package Pages.Yourlogo_Ecommerce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.Assert;

public class RegisterTest extends BaseRun {
	HomePage Pages;
	RegisterDataPage User;
	AuthenticationPage signin;
	
	//Register Test and RegisterData
	
	@DataProvider(name="RegisterData")
	public static Object[][] RegisterData()
	{
		return new Object[][] {
			{"Gehad", "Khaled", "11111", "ElMarg", "Cairo", 3,"01101", 1,"01034567", "G@gmail.com"}
			
		};
	}
  @Test(dataProvider="RegisterData",priority=1)
  public void RegisterUserMail(String Frist,String Last,String passwd,String adress,String city,int state,String code,
		  int country,String phone,String mail)
  {
	  Pages=new HomePage(driver);
	  Pages.Rigester();
	  signin=new AuthenticationPage(driver);
	  signin.RegisterUser("Ghbumsimi@gmail.com");
	  Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account");
	  User=new RegisterDataPage(driver);
	  User.RegisteraiondataData(Frist, Last, passwd, adress, city, state, code, country, phone, mail);
	  Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
	  User.signout();
  }
  
  //LogIn test and Data
  
  @DataProvider(name="LoginData")
	public static Object[][] userData()
	{
		return new Object[][] {
			{"Gehadkh@gmail.com","00000"},
			{"Geh@gmail.com","11111"}
		};
	}
  
  @Test(dataProvider="LoginData",priority=2)
  public void UserloginTest(String Usermail,String Pass) {
	  Pages=new HomePage(driver);
	  Pages.Rigester();
	  signin=new AuthenticationPage(driver);
	  signin.UserLogin(Usermail,Pass);
	  Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
	  signin.signout();
	  Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication&back=my-account");

	}
  
}
