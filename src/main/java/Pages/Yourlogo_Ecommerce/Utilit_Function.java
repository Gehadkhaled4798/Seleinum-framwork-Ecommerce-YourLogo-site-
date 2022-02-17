package Pages.Yourlogo_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilit_Function {
	protected WebDriver driver ; 
	
	public Utilit_Function(WebDriver driver) {
		
		this.driver=driver;
	}
	
	protected void SetTextbox(By element,String text)
	{
		driver.findElement(element).sendKeys(text);	
	}
	
	protected void ButtonclickOn(By button)
	{
		driver.findElement(button).click();
	}
}
