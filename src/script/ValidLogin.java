package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;

public class ValidLogin extends BaseTest 
{
	@Test(priority=1)
public void testValidLogin() throws InterruptedException
{
		String un=FWUtil.getXLData(XL_PATH, "ValidLogin",1 ,0);
		String pw=FWUtil.getXLData(XL_PATH, "ValidLogin",1 ,1);
		String title=FWUtil.getXLData(XL_PATH, "ValidLogin",1 ,2);
		//Enter Valid User Name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter Valid password
		l.setPassword(pw);
		//Click on login button
		l.clickLogin();
		//Verify homepage is Displaed.
		EnterTimeTrackPage e=new  EnterTimeTrackPage();
		e.verifyHomePageIsDisplayed(driver, ETO, title);
		
		
}
}
