package Pages.Yourlogo_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Utilit_Function  {
	private By signinlink=By.linkText("Sign in");
	private By Product= By.id("header_logo");
	private By SearchText= By.id("search_query_top");
	private By SearchButton=By.name("submit_search");
	private WebDriver driver;
	
	public HomePage(WebDriver div)
	{
		super(div);
		this.driver=div;
	}
	
	public AuthenticationPage Rigester()
	{
		ButtonclickOn(signinlink);
		return new AuthenticationPage(driver);
	}
	
	public void OpenProductPage()
	{
		
		//return new ProductPage(driver);
	}

	public ProductPage Searchproduct(String product)
	{
		ButtonclickOn(Product);
		SetTextbox(SearchText,product);
		ButtonclickOn(SearchButton);
	  return new ProductPage(driver,product);
	}

}
