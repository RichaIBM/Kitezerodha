package kiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import loginPages.KiteHomePage;
import loginPages.KiteLogin1;
import loginPages.KiteLogin2;
import utility.UtilityClass;



public class TestClass extends BaseClass{
	//declare all useful member as Global.
	KiteLogin1 login1;
	KiteLogin2 login2;
	KiteHomePage home;
	
	@BeforeClass
	public void openBrowser() {
		initilizeBrowser();
		
	//Crate object of POM Classes.
	
	login1=new KiteLogin1(driver);
	login2=new KiteLogin2(driver);
	home=new KiteHomePage(driver);
	}
	@BeforeMethod
	
	public void LoginToApllication() throws Throwable {
		//Enter User name.
		login1.EnterUN(UtilityClass.getTD(1, 0));
		System.out.println(UtilityClass.getTD(1, 0));
		
		//Enter Password.
		login1.EnterPWD(UtilityClass.getTD(1,1));
		System.out.println(UtilityClass.getTD(1,1));
		
		//Click on Login Button.
		login1.ClickLoginBtn();
		
		//Enter PIN.
		login2.EnterPIN(UtilityClass.getTD(1,2));
		
		//Click on Continue button.
		login2.ClickCtnBtn();
	}
	
	@Test
	public void verifyUID() throws Throwable {
	Reporter.log("Running verifyUserID",true);
	String actID = home.verifyUID();
	String expID = UtilityClass.getTD(1, 0);
	Assert.assertEquals(expID, actID,"Both are different TC is Fail");
	}
	
	
	@AfterMethod
	public void logoutToApplication() {
		Reporter.log("Logout to Appplication",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
	}
}
