package loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1 {
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement LoginBtn;
	
	//Step2 Initialization.
	public KiteLogin1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Step3 Implementation.
	public void EnterUN(String username) {
		UN.sendKeys(username);
	}
	public void EnterPWD(String pwd) {
		PWD.sendKeys(pwd);
	}
	public void ClickLoginBtn() {
		LoginBtn.click();
	}
}
