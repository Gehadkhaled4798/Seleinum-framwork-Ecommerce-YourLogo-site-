package Pages.Yourlogo_Ecommerce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.Assert;

public class RegisterTest extends BaseRun {
	//HomePage Pages;
	RegisterDataPage User;
	AuthenticationPage signin;
	YourAccountPage Account;
	//Register Test and RegisterData
	
	@DataProvider(name="RegisterData")
   public static Object[][] RegisterData()
	{
		return new Object[][] {
			{"Gehad", "Khaled", "11111", "ElMarg", "Cairo", 3,"01101", 1,"01034567", "G@gmail.com"}
			
		};
	}
  @Test(dataProvider="RegisterData")
  public void RegisterUserMail(String Frist,String Last,String passwd,String adress,String city,int state,String code,
		  int country,String phone,String mail)
  {
	  signin=homePage.Rigester();
	  User=signin.RegisterUser("hbumummi@gmail.com");
	  Account= User.RegisteraiondataData(Frist, Last, passwd, adress, city, state, code, country, phone, mail);
	  Assert.assertTrue(Account.VerfiyYourAccountOpen().contains("Welcome to your account"));//, "http://automationpractice.com/index.php?controller=my-account");
  }
  
  
}
