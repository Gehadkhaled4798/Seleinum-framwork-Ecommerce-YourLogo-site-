package Pages.Yourlogo_Ecommerce;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

//import Trails.HomePage;

public class BaseRun {
	 //public static ChromeDriver driver;
	 String PPath=System.getProperty("user.dir");
	 protected HomePage homePage;
	 private WebDriver driver;
	 
  @BeforeClass
  public void beforeClass() {
	  String CPath=PPath+"\\Resources\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", CPath);
     driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    driver.navigate().to("http://automationpractice.com/index.php?");
    homePage=new HomePage(driver);
  }

  @AfterMethod
  public void Screenshot(ITestResult result)
  {
	  if(ITestResult.FAILURE == result.getStatus())
	    {
		  TakesScreenshot shots=(TakesScreenshot)driver;
		  File F=shots.getScreenshotAs(OutputType.FILE);
		 try{
			 
		 Files.move(F, new File(PPath+"\\Screenshots\\"+result.getName()+".png"));
		 }
		 catch(IOException e){
		        e.printStackTrace();
		 }
	    }
  }
  @AfterTest
  public void Aftertest() {
	 // driver.quit();
  }
}
