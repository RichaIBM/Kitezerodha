package loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2 {
	//Step1 Declaration.
			@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
			@FindBy(xpath="//button[text()='Continue ']")private WebElement CtnBtn;
			
			//Step2 Initialization.
			public KiteLogin2(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			//Implementation.
			public void EnterPIN(String pin) {
				PIN.sendKeys(pin);
			}
			public void ClickCtnBtn() {
				CtnBtn.click();
			}
}
