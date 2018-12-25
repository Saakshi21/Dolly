package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;



public class TC2
{
static int p=0;
static int f=0;
@AfterMethod
public void m1(ITestResult res)
{
	String name=res.getName();
	int status=res.getStatus();
	if(status==1)
	{
		p++;
	}
	else
	{
		f++;
	}
	Reporter.log(name+"status"+status,true);
}
@AfterSuite
	public void print()
	{
	Reporter.log("pass"+p,true);
	Reporter.log("Fail:"+f,true);
	}
@Test
public void testA()
{
	Reporter.log("Run testA",true);
	}
@Test
public void testB()
{
	Reporter.log("Run TestB",true);
	Assert.fail();
}

}
