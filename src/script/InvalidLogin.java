package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;

public class InvalidLogin extends BaseTest
{
@Test(priority=2)
public void testInvalidLogin() throws InterruptedException
{
	int rc=FWUtil.getXLRowCount(XL_PATH, "InvalidLogin");
	Reporter.log("rc"+rc,true);
	for (int i=1;i<=rc;i++)
	{
		String un=FWUtil.getXLData(XL_PATH, "InvalidLogin", i, 0);
		String pw=FWUtil.getXLData(XL_PATH, "InvalidLogin", i, 1);
		//Enter invalid username
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter invalid passward
		l.setPassword(pw);
		//click login
		l.clickLogin();
		Thread.sleep(2000);
		//verifyErr msg is displayed
		l.verifyErrMsgDisplyed();
		
		
	}
}
}
