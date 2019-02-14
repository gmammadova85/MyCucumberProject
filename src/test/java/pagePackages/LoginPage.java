package pagePackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Base;

public class LoginPage extends Base{
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	public WebElement userName;
	@FindBy(id="pass")
	public WebElement passWord;
	@FindBy(xpath="//@ input[value='Log In']")
			public WebElement logInBtn;


}
