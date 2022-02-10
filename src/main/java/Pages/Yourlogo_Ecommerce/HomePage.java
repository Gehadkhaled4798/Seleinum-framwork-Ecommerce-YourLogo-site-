package Pages.Yourlogo_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Utilit_Function  {
	private By signinlink=By.linkText("Sign in");
	private By Product= By.id("header_logo");
	private By SearchText= By.id("search_query_top");
	private By SearchButton=By.name("submit_search");

	public HomePage(WebDriver div)
	{
		super(div);
	}
	
	public void Rigester()
	{
		ButtonclickOn(signinlink);
	}
	
	public void OpenProductPage()
	{
		ButtonclickOn(Product);
	}

	public void Searchproduct(String product)
	{
		SetTextbox(SearchText,product);
		ButtonclickOn(SearchButton);
	}

}
